package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Song extends Model
{
  public String title;
  public String artist;
  public int duration;
  
  public Song(String title, String artist, int duration)
  {
    this.title = title;
    this.artist = artist;
    this.duration = duration;
  }
}
