package models;

import java.util.ArrayList;
import java.util.List;

public class Playlist
{
  public String title;
  public List<Song> songs = new ArrayList<Song>();
  public int duration;

  public Playlist(String title, int duration)
  {
    this.title = title;
    this.duration = duration;
  }
}