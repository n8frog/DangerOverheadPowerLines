package com.example.dop;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.badlogic.androidgames.framework.FileIO;

public class Settings {
	//set up initial highscores to be all zero
	public static int[] highscores = new int[] { 0, 0, 0, 0, 0 };
	//load settings from external storage from .DOP file
	//if no file yet or no external storage then load defaults
	public static void load(FileIO files) {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(files.readFile(".DOP")));
			for (int i = 0; i < 5; i++) {
				highscores[i] = Integer.parseInt(in.readLine());
			}
		}
		catch (IOException e) {
			// we have defaults
		}
		catch (NumberFormatException e) {
			//we have defaults
		}
		finally {
			try {
				if (in != null)
					in.close();
			}
			catch (IOException e) {
		}
	}
}
//save highscores to external storage else use defaults
public static void save(FileIO files) {
	BufferedWriter out = null;
	try {
		out = new BufferedWriter(new OutputStreamWriter(files.writeFile(".DOP")));
		for (int i = 0; i < 5; i++) {
			out.write(Integer.toString(highscores[i]));
		}
	}
	catch (IOException e) {
	}
	finally {
		try {
			if(out != null)
				out.close();
		}
		catch (IOException e) {
		}
	}		
}

//adding to the highscores
public static void addScore(int score) {
	for (int i = 0; i < 5; i++) {
		if (highscores[i] < score) {
			for (int j = 4; j > i; j--) 
				highscores[j] = highscores[j - 1];
			highscores[i] = score;
			break;
			}
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		