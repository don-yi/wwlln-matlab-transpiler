package expression;

public class ImportDeclaration extends Import {
	public String ds;
	public String fname;
	public String id;
	
	public ImportDeclaration(String ds, String fname, String id) {
		this.ds = ds;
		this.fname = fname;
		this.id = id;
	}
}
