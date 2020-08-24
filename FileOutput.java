package com.dxc.logical;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class FileOutput {


public static void main(String[] args) {

try {

FileOutputStream fout=new FileOutputStream("abx.txt",true);

PrintStream ps=new PrintStream(fout);

ps.println("hello");
ps.println("hi");
ps.println("h0w r u");

System.out.println("DONE");

}
catch (FileNotFoundException e) {
e.printStackTrace();
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}

