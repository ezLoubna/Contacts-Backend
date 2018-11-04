package gestion.stock.mvc2.dao.impl;

import java.io.InputStream;
import javax.swing.JOptionPane;
import org.scribe.model.Token;
import org.scribe.model.Verifier;
import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;

import gestion.stock.mvc2.dao.IFlickrDao;

public class FlickrDaoImp  implements IFlickrDao {

	private Flickr flickr;
	private UploadMetaData uploadMetaData = new UploadMetaData();
	private String apiKey="7b1a8f511afcdc831292e5b4fc78e040";
	private String SharedSecret= "dc266b47225b7111";
	
	private void connect() {
		 flickr = new Flickr(apiKey,SharedSecret, new REST());
		 Auth auth= new Auth();
		 auth.setPermission(Permission.READ);
		 auth.setToken("");
		 auth.setTokenSecret("");
		 RequestContext requestContext = RequestContext.getRequestContext();
		 requestContext.setAuth(auth);
		 flickr.setAuth(auth);
	}

	@Override
	public String savePhoto(InputStream photo, String title) throws FlickrException {
		// TODO Auto-generated method stub
		connect();
		uploadMetaData.setTitle(title);
		String photoId= flickr.getUploader().upload(photo, uploadMetaData);
		return flickr.getPhotosetsInterface().getPhoto(photoId).getMeduim640Url();		
	}
	 public void auth() {
		 flickr = new Flickr(apiKey, SharedSecret, new REST());
		 AuthInterface authInterface= flickr.getAuthInterface();
		  
		 Token token = authInterface.getRequestToken();
		 System.out.println("token: " + token);
		 String url = authInterface.getAuthorizationUrl(token, Permission.DELETE);
		 System.out.println("Follow this URL to autorise yourself on flicker");
		 System.out.println(url);
		 System.out.println("paste in the token it gives you");
		 System.out.println(">>");
		 
		 String tokenKey= JOptionPane.showInputDialog(null);
		 
		 Token requestToken= authInterface.getAccessToken(token, new Verifier(tokenKey));
		 System.out.println("Authentification success");
		  
		 Auth auth= null ;
		  try {
			auth= authInterface.checkToken(requestToken);
		} catch (FlickrException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	// this token can be used untill the user revokes it
	 System.out.println("Token : "  + requestToken.getToken());
	 System.out.println("Secret: "+ requestToken.getSecret());
	 System.out.println("nsid: "+ auth.getUser().getId());
	 System.out.println("Realname: "+ auth.getUser().getRealName());
	 System.out.println("Username: " + auth.getUser().getUsername() );
	 System.out.println("Permission: "+ auth.getPermission().getType());
	 
	 
	 

}
}
