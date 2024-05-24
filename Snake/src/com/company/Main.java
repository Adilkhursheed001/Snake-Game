package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
      JFrame frame = new JFrame("Snake");
      int width = 600;
      int height = 600;
      frame.setSize(width,height);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setResizable(false);

      Game game = new Game(height,width);
      frame.add(game);
      frame.pack();
      game.requestFocus();

    }
}
