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
	    	result="�÷��̾ �̰���ϴ�. �÷��̾� : "+player+" ��ǻ�� : "+com;
	    }else{
	    	result="�÷��̾ �����ϴ�. �÷��̾� : "+player+" ��ǻ�� : "+com;
	    }
		return result;
	}

}
