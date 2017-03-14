package controllers;

import java.util.List;

import models.Song;
import play.mvc.Controller;

public class Admin extends Controller
{
  public static void index()
  {
    List<Song> songs = Song.findAll();
    render("admin.html", songs);
  }
}
