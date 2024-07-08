package is.jasper.test;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

public class TestDataSource implements JRDataSource {

  @Override
  public Object getFieldValue(JRField jrField) throws JRException {
    return null;
  }

  @Override
  public boolean next() throws JRException {
    return false;
  }

  public JRDataSource subreportDataSource() {
    return new TestDataSource();
  }
}
