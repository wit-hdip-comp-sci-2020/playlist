package models;

import java.util.ArrayList;
import java.util.List;

public class Playlist
{
  public String title;
  public List<Song> songs = new ArrayList<Song>();

  public Playlist(String title)
  {
    this.title = title;
  }
}