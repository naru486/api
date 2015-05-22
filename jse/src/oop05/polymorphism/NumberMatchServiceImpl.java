package oop05.polymorphism;

public class NumberMatchServiceImpl implements NumberMatchService{
	int player,com;
	
	@Override
	public int makeComVal(int player) {
		this.player=player;
		com=(int)(Math.random()*2)+1;
		return com;
	}

	@Override
	public boolean match(int playVal, int comVal) {
		if(playVal==comVal)
			return true;
		else
			return false;
	}

	@Override
	public String display() {
		String result="";
		//System.out.println(com);
	    if(match(this.player,com)){
	    	result="플레이어가 이겼습니다. 플레이어 : "+player+" 컴퓨터 : "+com;
	    }else{
	    	result="플레이어가 졌습니다. 플레이어 : "+player+" 컴퓨터 : "+com;
	    }
		return result;
	}

}
