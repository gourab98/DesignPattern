package DesignPattern.Composite_Pattern;

import java.util.ArrayList;

class Directory implements AbstractFile{

    private String name;
    private ArrayList includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj){
        includedFiles.add(obj);
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("  ");
        for(Object includedFile : includedFiles){
            AbstractFile obj = (AbstractFile) includedFile;
            obj.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}
