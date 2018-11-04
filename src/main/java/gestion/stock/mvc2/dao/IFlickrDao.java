package gestion.stock.mvc2.dao;

import java.io.InputStream;

import com.flickr4java.flickr.FlickrException;

public interface IFlickrDao {
	public String savePhoto(InputStream photo, String title) throws FlickrException;

}
