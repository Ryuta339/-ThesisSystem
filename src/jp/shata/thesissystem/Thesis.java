/*
 * Created by Shata Kurashi
 * 18th Jul. 2017
 */

package jp.shata.thesissystem;

import java.util.ArrayList;
import java.util.Calendar;

public class Thesis {
	private String title;
	private ArrayList<Author> authors;
	private Calendar date;

	public Thesis (String title, ArrayList<Author> authors, Calendar date){
		this.title = title;
		this.authors = authors;
		this.date = date;
		authors.setThesis (this);
	}

	protected String getTitle () { return title; }
	protected ArrayList<Author> getAuthors () { return authors; }

	@Override
	public boolean equals (Object obj) {
		if (! obj instanceof Thesis) return false;
		Thesis thesis.
}
