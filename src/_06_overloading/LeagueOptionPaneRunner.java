package _06_overloading;

import java.awt.Color;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane.showMessageDialog("The League is the Best!");
		LeagueOptionPane.showMessageDialog("The League is the Best!", "League Message");
		LeagueOptionPane.showMessageDialog("The League is the Best!", "Also League Message", "leagueDark.png");
		LeagueOptionPane.showMessageDialog("The league is the Best!", "The Best League Message", "java.png", Color.BLUE);
	}
}
