package controllers;

import java.util.ArrayList;
import java.util.List;

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
    Playlist p1 = new Playlist("Beethoven Sonatas");
    p1.songs.add (s1);
    p1.songs.add (s2);
    p1.songs.add (s3);
    
    Song s4 = new Song("Piano Concerto No. 1", "Beethoven");
    Song s5 = new Song("Piano Concerto No. 12", "Beethoven");
    Song s6 = new Song("Piano Concerto No. 23", "Beethoven");
    Playlist p2 = new Playlist("Beethoven Concertos");
    p2.songs.add (s4);
    p2.songs.add (s5);
    p2.songs.add (s6);
    
    List<Playlist> playlists = new ArrayList<Playlist>();
    playlists.add(p1);
    playlists.add(p2);
    
    render ("dashboard.html", playlists);
  }
}
