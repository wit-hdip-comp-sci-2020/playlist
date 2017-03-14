package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Playlist;
import models.Song;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller
{
  public static void index() 
  {
    Logger.info("Rendering Admin");
    
    List<Playlist> playlists = Playlist.findAll();
    render ("dashboard.html", playlists);
  }

  public static void deletePlaylist (Long id)
  {
    Playlist playlist = Playlist.findById(id);
    Logger.info ("Removing" + playlist.title);
    playlist.delete();
    redirect ("/dashboard");
  }
}
