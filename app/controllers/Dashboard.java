package controllers;

import models.Playlist;
import models.Song;
import play.Logger;
import play.mvc.Controller;

public class Dashboard extends Controller
{
  public static void index() {
    Logger.info("Rendering Dashboard");
    
    Song s1 = new Song("Piano Sonata No. 3", "Beethoven");
    Song s2 = new Song("Piano Sonata No. 7", "Beethoven");
    Song s3 = new Song("Piano Sonata No. 10", "Beethoven");
    Playlist playlist = new Playlist("Beethoven Sonatas");
    playlist.songs.add (s1);
    playlist.songs.add (s2);
    playlist.songs.add (s3);
    
    render ("dashboard.html", playlist);
  }
}
