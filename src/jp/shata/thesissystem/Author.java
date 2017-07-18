/*
 * Created by Shata Kurashi
 * 18th Jul. 2017
 */

package jp.shata.thesissystem;

public class Author {
	private String name;

	ThesisList thesisList;

	public Author (String name) {
		this.name = name;
		thesisList = new ThesisList ();
	}

	public boolean setThesis (Thesis thesis) {
		return thesisList.add (thesis);
	}
}
