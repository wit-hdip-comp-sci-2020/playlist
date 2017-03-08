package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import play.db.jpa.Model;

@Entity
public class Playlist extends Model
{
  public String title;
  @OneToMany(cascade = CascadeType.ALL)
  public List<Song> songs = new ArrayList<Song>();
  public int duration;

  public Playlist(String title, int duration)
  {
    this.title = title;
    this.duration = duration;
  }
}