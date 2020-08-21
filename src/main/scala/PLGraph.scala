package src

import org.graphstream.graph.implementations.MultiGraph

object PLGraph {

  val PL_CSV_FILE = "pl.csv"
  val USER_DIR = System.getProperty("user.dir")
  val STYLE = "stylesheet.css"

  def main(args: Array[String]): Unit = {

    // create the graph
    val graph = new MultiGraph("PL")
    graph.addAttribute("ui.stylesheet", "url('file://" + USER_DIR + "/" + STYLE + "')")
    graph.addAttribute("ui.antialias")

    // TODO: parse the PL_CSV_FILE to create a directed graph of PLs


    // display the graph
    graph.display()
  }
}
