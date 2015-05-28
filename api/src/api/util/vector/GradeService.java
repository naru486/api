package api.util.vector;
import java.util.Vector;

public interface GradeService {
	public void input(GradeVO vo);
	public void print();
	public String searchGradeByHak(String hak);
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
