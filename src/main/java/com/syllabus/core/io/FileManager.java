package com.syllabus.core.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.syllabus.core.data.duration.AcademicYear;

public class FileManager {

	public static void saveToFile( AcademicYear year, File file ) 
										throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(
										new FileOutputStream( file ) );
		oos.writeObject( year );
		oos.flush();
		oos.close();
	}
	
	public static AcademicYear loadFromFile( File file ) 
									throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream( new FileInputStream( file ) );		
		try {
			AcademicYear year = (AcademicYear)ois.readObject() ;
			return year;			
		} 
		catch( ClassCastException ex ) {
			throw new IllegalArgumentException( "File is of wrong type" );
		} 
		finally {
			ois.close();
		}
	}

}
