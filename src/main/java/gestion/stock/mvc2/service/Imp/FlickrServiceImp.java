package gestion.stock.mvc2.service.Imp;

import java.io.InputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flickr4java.flickr.FlickrException;

import gestion.stock.mvc2.dao.IFlickrDao;
import gestion.stock.mvc2.service.IFlickrService;

@Service
public class FlickrServiceImp  implements IFlickrService{

	
	private IFlickrDao dao;
	
	@Autowired
	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}


	@Override
	public String savePhoto(InputStream photo, String title) throws FlickrException {
		// TODO Auto-generated method stub
		return dao.savePhoto(photo, title);
	}

}
