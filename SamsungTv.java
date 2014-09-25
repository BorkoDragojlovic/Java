
public class SamsungTv implements Tv {
	boolean _on;
	int _chanel;
	int _volume;
	
	@Override
	public void powerButton() {
		if (_on = true) 
			_on = false;
		else 
			_on = true;
	}
	
	@Override
	public void changeTheChanel(int i) {
		_chanel = i;
	}
	
	@Override
	public void volumeUP() {
		_volume++;
	}
}

