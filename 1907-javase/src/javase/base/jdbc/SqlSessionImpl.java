package javase.base.jdbc;

import java.util.List;

public class SqlSessionImpl implements SqlSession{
	public User selectOne(String sql) {
		User user = new User();
		user.setId(7);
		user.setName("ղķʿ���");
		user.setAge(50);
		user.setCompany("����6��");
		
		return user;
	}

	public List<User> selectList(String sql) {
		return null;
	}

	public int insert(String sql) {
		return 0;
	}

	public int update(String sql) {
		return 0;
	}

	public int delete(String sql) {
		return 0;
	}

}
