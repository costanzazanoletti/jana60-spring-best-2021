package jana60.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

  /* metodo per la home */
  @GetMapping
  public String index() {
    return "index";
  }

  /* metodo per i movies */
  @GetMapping("/movies")
  public String movies(Model model) {
    // lista dei best movies
    List<String> movieList =
        List.of("My Salinger Year", "Palmer", "Blu Bayou", "Cruella", "Percy VS Goliath");
    model.addAttribute("movieList", movieList);
    return "movies";
  }

  /* metodo per le songs */
  @GetMapping("/songs")
  public String songs(Model model) {
    List<String> songList = List.of("2010 — Earl Sweatshirt", "Keep An Eye on Dan — ABBA",
        "Like I Used To — Sharon Van Etten & Angel Olsen");
    model.addAttribute("songList", songList);

    return "songs";
  }
}
