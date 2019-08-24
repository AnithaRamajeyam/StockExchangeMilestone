package com.demo.stockExchangeApplication.dao;

/*@Repository
public class CompanyDaoImpl implements CompanyDao {
	
	@Override
	public int insertCompany(Company company) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			ps=con.prepareStatement("insert into company(company_name,turnover,ceo,board_of_directors,sector_id,brief_writeup,stock_Code) values(?,?,?,?,?,?,? )");
			ps.setString(1,company.getCompanyName());
			ps.setDouble(2, company.getTurnOver());
			ps.setString(3, company.getCeo());
			ps.setString(4,company.getBoardOfDirectors());
			int sectorid=1;
			ps.setInt(5,sectorid);
			ps.setString(6, company.getBriefWriteup());
			int stockcode=10;
			ps.setInt(7,stockcode);
			result=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	
	}

	@Override
	public boolean updateCompany(Company company) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Company> getCompanyList() throws Exception {
			Connection con=null;
		    PreparedStatement ps=null;
		    List<Company> companylist= new ArrayList<Company>();
		    Company company=null;  
		    try {	
		    	Class.forName("com.mysql.jdbc.Driver");
			    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			    ps=con.prepareStatement("select * from company");
			    ResultSet rs=ps.executeQuery();
	
			    while(rs.next())
			    {
			    
			    	company = new Company();
			    	company.setCompanyCode(rs.getInt("company_code"));
			    	company.setCompanyName(rs.getString("company_name"));
			    	company.setTurnOver(rs.getDouble("turnover"));
			    	company.setCeo(rs.getString("ceo"));
			    	company.setBoardOfDirectors(rs.getString("board_of_directors"));
			    	company.setSectorId(rs.getInt("sector_id"));
			    	company.setBriefWriteup(rs.getString("brief_writeup"));
			    	company.setStockCode(rs.getInt("stock_Code"));
			    	companylist.add(company);
	
			    }
				
			} catch (Exception e) {
				System.out.println(e);
				throw e;
			}
		    	
			return companylist;
	}
}

	@Override
	public boolean updateCompany(Company company) {
	Connection con=null;
    PreparedStatement ps=null;
    boolean result=false;
    try {
    			Class.forName("com.mysql.jdbc.Driver");
    			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/e_auction","root","root");
    			ps=con.prepareStatement("update company set company_name=?,turnover=?,ceo=?,board_of_directors=?,sector_id=?,breifwriteup=?,stock_Code=? where company_id=?");
    			ps.setString(1,company.getCompanyName());
    			ps.setDouble(2, company.getTurnOver());
    			ps.setString(3, company.getCeo());
    			ps.setString(4,company.getBoardOfDirectors());
    			ps.setInt(5, company.getSectorId());
    			ps.setString(6, company.getBriefWriteup());
    			ps.setInt(7,company.getStockCode());
    			result=ps.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}




*/