package Funtion;

import INTERFACE.BookFunction;
import Message.BookMessage;
import java.util.*;

public class BookMessage_Controller implements BookFunction{
	ArrayList <BookMessage> list=new ArrayList <>();
	public boolean BookMessage_enter(String ISBN,String name,String press,String author,double price)	
	{
		BookMessage book=new BookMessage();
		book.setISBN(ISBN);
		book.setName(name);
		book.setPress(press);
		book.setAuthor(author);
		book.setPrice(price);
		list.add(book);
		return true;
	}
	
	public String BookMessage_inquire(String name)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getName().equals(name))
				return list.get(i).getISBN()+"/t"
					+list.get(i).getName()+"/t"
					+list.get(i).getPrice()+"/t"
					+list.get(i).getAuthor()+"/t"
					+list.get(i).getPress();
		}
		return null;
	}
	
	public boolean BookMessage_alter(String name,String change)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getName().equals(name)) {
				list.get(i).setName(change);
				return true;
			}
		}
		return false;
	}
	
	public String CheckBook() 
	{
		for(int i=0;i<list.size();i++)
			{
				return list.get(i).getISBN()+"/t"
					+list.get(i).getName()+"/t"
					+list.get(i).getPrice()+"/t"
					+list.get(i).getAuthor()+"/t"
					+list.get(i).getPress();
			}
		return null;
		
	}
}
