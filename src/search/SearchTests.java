package search;

import search.read.FileContentReader;
import search.read.ScannerContentReader;
import search.scanner.FileScanner;
import search.scanner.RecursiveFileScanner;
import search.search.ContentSearcher;
import search.search.PrimitiveContentSearcher;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class SearchTests {
    public static void main(String[] args) throws IOException {
        new SearchEngine().searchAndPrintResults(
                new File("/home/integer/git/javacore5/java-core-5-lesson-9-2"),
                "in file root"
        );
    }
}
