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
    
    Song s1 = new Song("Piano Sonata No. 3", "Beethoven", 5);
    Song s2 = new Song("Piano Sonata No. 7", "Beethoven", 6);
    Song s3 = new Song("Piano Sonata No. 10", "Beethoven",8 );
    Playlist p1 = new Playlist("Beethoven Sonatas", 19);
    p1.songs.add (s1);
    p1.songs.add (s2);
    p1.songs.add (s3);
    
    Song s4 = new Song("Piano Concerto No. 1", "Beethoven", 8);
    Song s5 = new Song("Piano Concerto No. 12", "Beethoven", 12);
    Song s6 = new Song("Piano Concerto No. 23", "Beethoven", 23);
    Playlist p2 = new Playlist("Beethoven Concertos", 43);
    p2.songs.add (s4);
    p2.songs.add (s5);
    p2.songs.add (s6);
    
    Song s7 = new Song ("Opus 34: Six variations on a theme in F major", "Beethoven", 12);
    Song s8 = new Song ("Opus 120: Thirty-three variations on a waltz by Diabelli in C major", "Beethoven", 14);
    Playlist p3 = new Playlist("Beethoven Variations", 26);
    p3.songs.add (s7);
    p3.songs.add (s8);
    
    List<Playlist> playlists = new ArrayList<Playlist>();
    playlists.add(p1);
    playlists.add(p2);
    playlists.add(p3);
    
    render ("dashboard.html", playlists);
  }
}
