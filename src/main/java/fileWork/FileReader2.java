package fileWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileReader2
{


    public static void main( String[] args ) throws IOException
    {
        readFileToMap();
    }

    public static HashMap readFileToMap() throws IOException
    {
        HashMap<String, Integer> map = new HashMap<>();

        FileInputStream inputStream = null;
        Scanner sc = null;
        try
        {
            inputStream = new FileInputStream( "/Users/panda/IdeaProjects/Avac-beta/src/main/resources/sortedWords" );
            sc = new Scanner( inputStream, "UTF-8" );

            int counter = 0;
            while( sc.hasNextLine() )
            {
                String line = sc.nextLine();
                String[] a = line.split( ":" );
                map.put( a[ 0 ], Integer.parseInt( a[ 1 ].trim() ) );

                counter++;

            }
            System.out.println( map.size() );


        }
        finally
        {
            if( inputStream != null )
            {
                inputStream.close();
            }
            if( sc != null )
            {
                sc.close();
            }
        }
        return map;
    }
}
