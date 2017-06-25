package fr.holots.testclick;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

public class Main extends BasicGame {
	
	public static int width = 1280;
	public static int height = 720;
	public static boolean fullscreen = false;
	public static int fps = 60;
	private GameContainer container;
	private TiledMap map;

	public Main(String title) {
		super(title);

	}

	public static void main(String[] args) {
		try {
			AppGameContainer app = new AppGameContainer(new Main("TestSlick"));
			app.setDisplayMode(width, height, fullscreen);
			app.setTitle("TestSlick");
			app.setForceExit(true);
			app.setTargetFrameRate(fps);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void render(GameContainer arg0, Graphics arg1) throws SlickException {

		this.map.render(0, 0);
	}

	@Override
	public void init(GameContainer container) throws SlickException {

		this.container = container;
		this.map = new TiledMap("data/map/mapTest_1.tmx");
	}

	@Override
	public void update(GameContainer arg0, int arg1) throws SlickException {

		
	}
	
	public void keyReleased(int key, char c) {
        if (Input.KEY_ESCAPE == key) {
			container.exit();
        }
    }

}
