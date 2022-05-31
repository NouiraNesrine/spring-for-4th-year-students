package org.intellij.myspring.aware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CustomLoader implements ResourceLoaderAware {
    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Resource r = resourceLoader.getResource("file:C:/Users/nesri/Desktop/myfile.txt");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(r.getInputStream()))){
            String line= null;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
