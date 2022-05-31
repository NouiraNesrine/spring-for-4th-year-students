package org.intellij.myspring.factory;


import java.util.Map;

public class ReaderFactory {

    private Map<ReaderType,Reader> readers = null;

    public void setReaders(Map<ReaderType,Reader> readers){
        this.readers= readers;
    }

    public Reader createReader(ReaderType type){
        if(readers.containsKey(type)){
            return readers.get(type);
        }else{
            throw new IllegalArgumentException("invalid argument");
        }
    }

//    public static Reader getReader(ReaderType readerType){
//        switch (readerType){
//            case File_Reader: return new FileReader();
//            case Socket_Reader: return new SocketReader();
//            case Db_Reader: return new DbReader();
//            default:throw new IllegalArgumentException("invalid reader");
//        }
//    }
}
