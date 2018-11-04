package gestion.stock.mvc2.service;

import java.io.InputStream;

import com.flickr4java.flickr.FlickrException;

public interface IFlickrService {
	public String savePhoto(InputStream photo, String title) throws FlickrException;

}
