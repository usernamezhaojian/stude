package javase.base.jdbc;

import java.util.List;

public class UserServiceImpl implements UserService{
	//�������֮�⣬����¶���������ַ�ʽ���ڼ̳У���ѡ�����ַ�����Ϊ���
	private SqlSession sqlSession = new SqlSessionImpl();		
	
	@Override
	public User get(Integer id) {
		return sqlSession.selectOne("");
	}

	@Override
	public List<User> queryList() {
		return sqlSession.selectList("");
	}

	@Override
	public void add(User user) {
		sqlSession.insert("");
	}

	@Override
	public void update(User user) {
		sqlSession.update("");
	}

	@Override
	public void delete(Integer id) {
		sqlSession.delete("");
	}

}
