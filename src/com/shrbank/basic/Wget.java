package com.shrbank.basic;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * Created by lilei on 2017/11/10 下午4:43.
 */
public class Wget {
    public static void main(String[] args) {

        // read in data from URL
        String url = "https://introcs.cs.princeton.edu/java/data/codes.csv";
        In in = new In(url);
        String data = in.readAll();

        // write data to a file
        String filename = url.substring(url.lastIndexOf('/') + 1);
        Out out = new Out(filename);
        out.println(data);
        out.close();
    }
}
