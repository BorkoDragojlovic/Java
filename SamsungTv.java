
public class SamsungTv implements Tv {
	private boolean _on;
	private int _chanel = 1;
	private int _volume;
	// Nepravilno deklarisana varijabla, kako bi se videla kompajlerska greska.
	int int;
	
	public SamsungTv () {
	}
	
	public SamsungTv (boolean on, int chanel, int volume) {
		this._on = on;
		this._chanel = chanel;
		this._volume = volume;
	}
	
	public boolean is_on() {
		return _on;
	}

	public int get_chanel() {
		return _chanel;
	}

	public int get_volume() {
		return _volume;
	}

	@Override
	public void powerButton() {
		if (_on == false)
			_on = true;
		else 
			_on = false;
		
	}
	
	@Override
	public void changeTheChanel(int i) {
		_chanel = i;
	}
	
	@Override
	public void volumeUP() {
		_volume++;
	}
	
	@Override
	public void volumeDown() {
		_volume--;
	}
	
	//Testiranje ispisivanja neinicijalizovane lokalne varijable na ekranu, prema "Variable: Exercise 2"
	public void testiranjeNeinicijalizovaneLokalneVarijable() {
		int ix;
		System.out.println(ix);
	}
}

