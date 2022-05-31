package org.intellij.myspring.factory;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class ReaderConfiguration {

    @Bean
    public ReaderFactory readerFactory(){
        Map<ReaderType,Reader> readers = new HashMap<>();
        readers.put(ReaderType.File_Reader,new FileReader());
        readers.put(ReaderType.Socket_Reader,new SocketReader());
        readers.put(ReaderType.Db_Reader,new DbReader());
        ReaderFactory reader = new ReaderFactory();
        reader.setReaders(readers);
        return reader;
    }
    @Bean
    public Reader fileReader(){
    return readerFactory().createReader(ReaderType.File_Reader);
    }

    @Bean
    public Reader webReader(){
        return readerFactory().createReader(ReaderType.Socket_Reader);
    }

    @Bean
    public Reader dbReader(){
        return readerFactory().createReader(ReaderType.Db_Reader);
    }
}
