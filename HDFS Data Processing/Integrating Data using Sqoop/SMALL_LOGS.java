// ORM class for table 'SMALL_LOGS'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Apr 29 19:54:18 UTC 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SMALL_LOGS extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer L_Id;
  public Integer get_L_Id() {
    return L_Id;
  }
  public void set_L_Id(Integer L_Id) {
    this.L_Id = L_Id;
  }
  public SMALL_LOGS with_L_Id(Integer L_Id) {
    this.L_Id = L_Id;
    return this;
  }
  private java.sql.Date Log_Date;
  public java.sql.Date get_Log_Date() {
    return Log_Date;
  }
  public void set_Log_Date(java.sql.Date Log_Date) {
    this.Log_Date = Log_Date;
  }
  public SMALL_LOGS with_Log_Date(java.sql.Date Log_Date) {
    this.Log_Date = Log_Date;
    return this;
  }
  private String Log_Time;
  public String get_Log_Time() {
    return Log_Time;
  }
  public void set_Log_Time(String Log_Time) {
    this.Log_Time = Log_Time;
  }
  public SMALL_LOGS with_Log_Time(String Log_Time) {
    this.Log_Time = Log_Time;
    return this;
  }
  private String Log_Path;
  public String get_Log_Path() {
    return Log_Path;
  }
  public void set_Log_Path(String Log_Path) {
    this.Log_Path = Log_Path;
  }
  public SMALL_LOGS with_Log_Path(String Log_Path) {
    this.Log_Path = Log_Path;
    return this;
  }
  private String Log_Type;
  public String get_Log_Type() {
    return Log_Type;
  }
  public void set_Log_Type(String Log_Type) {
    this.Log_Type = Log_Type;
  }
  public SMALL_LOGS with_Log_Type(String Log_Type) {
    this.Log_Type = Log_Type;
    return this;
  }
  private String Log_Webfile;
  public String get_Log_Webfile() {
    return Log_Webfile;
  }
  public void set_Log_Webfile(String Log_Webfile) {
    this.Log_Webfile = Log_Webfile;
  }
  public SMALL_LOGS with_Log_Webfile(String Log_Webfile) {
    this.Log_Webfile = Log_Webfile;
    return this;
  }
  private Integer Log_Number1;
  public Integer get_Log_Number1() {
    return Log_Number1;
  }
  public void set_Log_Number1(Integer Log_Number1) {
    this.Log_Number1 = Log_Number1;
  }
  public SMALL_LOGS with_Log_Number1(Integer Log_Number1) {
    this.Log_Number1 = Log_Number1;
    return this;
  }
  private String Log_IPAddress;
  public String get_Log_IPAddress() {
    return Log_IPAddress;
  }
  public void set_Log_IPAddress(String Log_IPAddress) {
    this.Log_IPAddress = Log_IPAddress;
  }
  public SMALL_LOGS with_Log_IPAddress(String Log_IPAddress) {
    this.Log_IPAddress = Log_IPAddress;
    return this;
  }
  private Integer Log_Number2;
  public Integer get_Log_Number2() {
    return Log_Number2;
  }
  public void set_Log_Number2(Integer Log_Number2) {
    this.Log_Number2 = Log_Number2;
  }
  public SMALL_LOGS with_Log_Number2(Integer Log_Number2) {
    this.Log_Number2 = Log_Number2;
    return this;
  }
  private Integer Log_Number3;
  public Integer get_Log_Number3() {
    return Log_Number3;
  }
  public void set_Log_Number3(Integer Log_Number3) {
    this.Log_Number3 = Log_Number3;
  }
  public SMALL_LOGS with_Log_Number3(Integer Log_Number3) {
    this.Log_Number3 = Log_Number3;
    return this;
  }
  private Integer Log_Systembit;
  public Integer get_Log_Systembit() {
    return Log_Systembit;
  }
  public void set_Log_Systembit(Integer Log_Systembit) {
    this.Log_Systembit = Log_Systembit;
  }
  public SMALL_LOGS with_Log_Systembit(Integer Log_Systembit) {
    this.Log_Systembit = Log_Systembit;
    return this;
  }
  private Integer Log_Number4;
  public Integer get_Log_Number4() {
    return Log_Number4;
  }
  public void set_Log_Number4(Integer Log_Number4) {
    this.Log_Number4 = Log_Number4;
  }
  public SMALL_LOGS with_Log_Number4(Integer Log_Number4) {
    this.Log_Number4 = Log_Number4;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SMALL_LOGS)) {
      return false;
    }
    SMALL_LOGS that = (SMALL_LOGS) o;
    boolean equal = true;
    equal = equal && (this.L_Id == null ? that.L_Id == null : this.L_Id.equals(that.L_Id));
    equal = equal && (this.Log_Date == null ? that.Log_Date == null : this.Log_Date.equals(that.Log_Date));
    equal = equal && (this.Log_Time == null ? that.Log_Time == null : this.Log_Time.equals(that.Log_Time));
    equal = equal && (this.Log_Path == null ? that.Log_Path == null : this.Log_Path.equals(that.Log_Path));
    equal = equal && (this.Log_Type == null ? that.Log_Type == null : this.Log_Type.equals(that.Log_Type));
    equal = equal && (this.Log_Webfile == null ? that.Log_Webfile == null : this.Log_Webfile.equals(that.Log_Webfile));
    equal = equal && (this.Log_Number1 == null ? that.Log_Number1 == null : this.Log_Number1.equals(that.Log_Number1));
    equal = equal && (this.Log_IPAddress == null ? that.Log_IPAddress == null : this.Log_IPAddress.equals(that.Log_IPAddress));
    equal = equal && (this.Log_Number2 == null ? that.Log_Number2 == null : this.Log_Number2.equals(that.Log_Number2));
    equal = equal && (this.Log_Number3 == null ? that.Log_Number3 == null : this.Log_Number3.equals(that.Log_Number3));
    equal = equal && (this.Log_Systembit == null ? that.Log_Systembit == null : this.Log_Systembit.equals(that.Log_Systembit));
    equal = equal && (this.Log_Number4 == null ? that.Log_Number4 == null : this.Log_Number4.equals(that.Log_Number4));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof SMALL_LOGS)) {
      return false;
    }
    SMALL_LOGS that = (SMALL_LOGS) o;
    boolean equal = true;
    equal = equal && (this.L_Id == null ? that.L_Id == null : this.L_Id.equals(that.L_Id));
    equal = equal && (this.Log_Date == null ? that.Log_Date == null : this.Log_Date.equals(that.Log_Date));
    equal = equal && (this.Log_Time == null ? that.Log_Time == null : this.Log_Time.equals(that.Log_Time));
    equal = equal && (this.Log_Path == null ? that.Log_Path == null : this.Log_Path.equals(that.Log_Path));
    equal = equal && (this.Log_Type == null ? that.Log_Type == null : this.Log_Type.equals(that.Log_Type));
    equal = equal && (this.Log_Webfile == null ? that.Log_Webfile == null : this.Log_Webfile.equals(that.Log_Webfile));
    equal = equal && (this.Log_Number1 == null ? that.Log_Number1 == null : this.Log_Number1.equals(that.Log_Number1));
    equal = equal && (this.Log_IPAddress == null ? that.Log_IPAddress == null : this.Log_IPAddress.equals(that.Log_IPAddress));
    equal = equal && (this.Log_Number2 == null ? that.Log_Number2 == null : this.Log_Number2.equals(that.Log_Number2));
    equal = equal && (this.Log_Number3 == null ? that.Log_Number3 == null : this.Log_Number3.equals(that.Log_Number3));
    equal = equal && (this.Log_Systembit == null ? that.Log_Systembit == null : this.Log_Systembit.equals(that.Log_Systembit));
    equal = equal && (this.Log_Number4 == null ? that.Log_Number4 == null : this.Log_Number4.equals(that.Log_Number4));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.L_Id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Log_Date = JdbcWritableBridge.readDate(2, __dbResults);
    this.Log_Time = JdbcWritableBridge.readString(3, __dbResults);
    this.Log_Path = JdbcWritableBridge.readString(4, __dbResults);
    this.Log_Type = JdbcWritableBridge.readString(5, __dbResults);
    this.Log_Webfile = JdbcWritableBridge.readString(6, __dbResults);
    this.Log_Number1 = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Log_IPAddress = JdbcWritableBridge.readString(8, __dbResults);
    this.Log_Number2 = JdbcWritableBridge.readInteger(9, __dbResults);
    this.Log_Number3 = JdbcWritableBridge.readInteger(10, __dbResults);
    this.Log_Systembit = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Log_Number4 = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.L_Id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.Log_Date = JdbcWritableBridge.readDate(2, __dbResults);
    this.Log_Time = JdbcWritableBridge.readString(3, __dbResults);
    this.Log_Path = JdbcWritableBridge.readString(4, __dbResults);
    this.Log_Type = JdbcWritableBridge.readString(5, __dbResults);
    this.Log_Webfile = JdbcWritableBridge.readString(6, __dbResults);
    this.Log_Number1 = JdbcWritableBridge.readInteger(7, __dbResults);
    this.Log_IPAddress = JdbcWritableBridge.readString(8, __dbResults);
    this.Log_Number2 = JdbcWritableBridge.readInteger(9, __dbResults);
    this.Log_Number3 = JdbcWritableBridge.readInteger(10, __dbResults);
    this.Log_Systembit = JdbcWritableBridge.readInteger(11, __dbResults);
    this.Log_Number4 = JdbcWritableBridge.readInteger(12, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(L_Id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(Log_Date, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Log_Time, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Log_Path, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Log_Type, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Log_Webfile, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Number1, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Log_IPAddress, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Number2, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Number3, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Systembit, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Number4, 12 + __off, 4, __dbStmt);
    return 12;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(L_Id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeDate(Log_Date, 2 + __off, 91, __dbStmt);
    JdbcWritableBridge.writeString(Log_Time, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Log_Path, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Log_Type, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(Log_Webfile, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Number1, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(Log_IPAddress, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Number2, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Number3, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Systembit, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(Log_Number4, 12 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.L_Id = null;
    } else {
    this.L_Id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Date = null;
    } else {
    this.Log_Date = new Date(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Time = null;
    } else {
    this.Log_Time = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Path = null;
    } else {
    this.Log_Path = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Type = null;
    } else {
    this.Log_Type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Webfile = null;
    } else {
    this.Log_Webfile = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Number1 = null;
    } else {
    this.Log_Number1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Log_IPAddress = null;
    } else {
    this.Log_IPAddress = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Number2 = null;
    } else {
    this.Log_Number2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Number3 = null;
    } else {
    this.Log_Number3 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Systembit = null;
    } else {
    this.Log_Systembit = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.Log_Number4 = null;
    } else {
    this.Log_Number4 = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.L_Id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.L_Id);
    }
    if (null == this.Log_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Log_Date.getTime());
    }
    if (null == this.Log_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_Time);
    }
    if (null == this.Log_Path) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_Path);
    }
    if (null == this.Log_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_Type);
    }
    if (null == this.Log_Webfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_Webfile);
    }
    if (null == this.Log_Number1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Number1);
    }
    if (null == this.Log_IPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_IPAddress);
    }
    if (null == this.Log_Number2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Number2);
    }
    if (null == this.Log_Number3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Number3);
    }
    if (null == this.Log_Systembit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Systembit);
    }
    if (null == this.Log_Number4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Number4);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.L_Id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.L_Id);
    }
    if (null == this.Log_Date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.Log_Date.getTime());
    }
    if (null == this.Log_Time) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_Time);
    }
    if (null == this.Log_Path) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_Path);
    }
    if (null == this.Log_Type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_Type);
    }
    if (null == this.Log_Webfile) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_Webfile);
    }
    if (null == this.Log_Number1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Number1);
    }
    if (null == this.Log_IPAddress) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, Log_IPAddress);
    }
    if (null == this.Log_Number2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Number2);
    }
    if (null == this.Log_Number3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Number3);
    }
    if (null == this.Log_Systembit) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Systembit);
    }
    if (null == this.Log_Number4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.Log_Number4);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(L_Id==null?"null":"" + L_Id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Date==null?"null":"" + Log_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Time==null?"null":Log_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Path==null?"null":Log_Path, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Type==null?"null":Log_Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Webfile==null?"null":Log_Webfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Number1==null?"null":"" + Log_Number1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_IPAddress==null?"null":Log_IPAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Number2==null?"null":"" + Log_Number2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Number3==null?"null":"" + Log_Number3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Systembit==null?"null":"" + Log_Systembit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Number4==null?"null":"" + Log_Number4, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(L_Id==null?"null":"" + L_Id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Date==null?"null":"" + Log_Date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Time==null?"null":Log_Time, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Path==null?"null":Log_Path, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Type==null?"null":Log_Type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Webfile==null?"null":Log_Webfile, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Number1==null?"null":"" + Log_Number1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_IPAddress==null?"null":Log_IPAddress, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Number2==null?"null":"" + Log_Number2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Number3==null?"null":"" + Log_Number3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Systembit==null?"null":"" + Log_Systembit, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(Log_Number4==null?"null":"" + Log_Number4, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.L_Id = null; } else {
      this.L_Id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Date = null; } else {
      this.Log_Date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_Time = null; } else {
      this.Log_Time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_Path = null; } else {
      this.Log_Path = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_Type = null; } else {
      this.Log_Type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_Webfile = null; } else {
      this.Log_Webfile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Number1 = null; } else {
      this.Log_Number1 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_IPAddress = null; } else {
      this.Log_IPAddress = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Number2 = null; } else {
      this.Log_Number2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Number3 = null; } else {
      this.Log_Number3 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Systembit = null; } else {
      this.Log_Systembit = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Number4 = null; } else {
      this.Log_Number4 = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.L_Id = null; } else {
      this.L_Id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Date = null; } else {
      this.Log_Date = java.sql.Date.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_Time = null; } else {
      this.Log_Time = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_Path = null; } else {
      this.Log_Path = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_Type = null; } else {
      this.Log_Type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_Webfile = null; } else {
      this.Log_Webfile = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Number1 = null; } else {
      this.Log_Number1 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.Log_IPAddress = null; } else {
      this.Log_IPAddress = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Number2 = null; } else {
      this.Log_Number2 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Number3 = null; } else {
      this.Log_Number3 = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Systembit = null; } else {
      this.Log_Systembit = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.Log_Number4 = null; } else {
      this.Log_Number4 = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    SMALL_LOGS o = (SMALL_LOGS) super.clone();
    o.Log_Date = (o.Log_Date != null) ? (java.sql.Date) o.Log_Date.clone() : null;
    return o;
  }

  public void clone0(SMALL_LOGS o) throws CloneNotSupportedException {
    o.Log_Date = (o.Log_Date != null) ? (java.sql.Date) o.Log_Date.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("L_Id", this.L_Id);
    __sqoop$field_map.put("Log_Date", this.Log_Date);
    __sqoop$field_map.put("Log_Time", this.Log_Time);
    __sqoop$field_map.put("Log_Path", this.Log_Path);
    __sqoop$field_map.put("Log_Type", this.Log_Type);
    __sqoop$field_map.put("Log_Webfile", this.Log_Webfile);
    __sqoop$field_map.put("Log_Number1", this.Log_Number1);
    __sqoop$field_map.put("Log_IPAddress", this.Log_IPAddress);
    __sqoop$field_map.put("Log_Number2", this.Log_Number2);
    __sqoop$field_map.put("Log_Number3", this.Log_Number3);
    __sqoop$field_map.put("Log_Systembit", this.Log_Systembit);
    __sqoop$field_map.put("Log_Number4", this.Log_Number4);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("L_Id", this.L_Id);
    __sqoop$field_map.put("Log_Date", this.Log_Date);
    __sqoop$field_map.put("Log_Time", this.Log_Time);
    __sqoop$field_map.put("Log_Path", this.Log_Path);
    __sqoop$field_map.put("Log_Type", this.Log_Type);
    __sqoop$field_map.put("Log_Webfile", this.Log_Webfile);
    __sqoop$field_map.put("Log_Number1", this.Log_Number1);
    __sqoop$field_map.put("Log_IPAddress", this.Log_IPAddress);
    __sqoop$field_map.put("Log_Number2", this.Log_Number2);
    __sqoop$field_map.put("Log_Number3", this.Log_Number3);
    __sqoop$field_map.put("Log_Systembit", this.Log_Systembit);
    __sqoop$field_map.put("Log_Number4", this.Log_Number4);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("L_Id".equals(__fieldName)) {
      this.L_Id = (Integer) __fieldVal;
    }
    else    if ("Log_Date".equals(__fieldName)) {
      this.Log_Date = (java.sql.Date) __fieldVal;
    }
    else    if ("Log_Time".equals(__fieldName)) {
      this.Log_Time = (String) __fieldVal;
    }
    else    if ("Log_Path".equals(__fieldName)) {
      this.Log_Path = (String) __fieldVal;
    }
    else    if ("Log_Type".equals(__fieldName)) {
      this.Log_Type = (String) __fieldVal;
    }
    else    if ("Log_Webfile".equals(__fieldName)) {
      this.Log_Webfile = (String) __fieldVal;
    }
    else    if ("Log_Number1".equals(__fieldName)) {
      this.Log_Number1 = (Integer) __fieldVal;
    }
    else    if ("Log_IPAddress".equals(__fieldName)) {
      this.Log_IPAddress = (String) __fieldVal;
    }
    else    if ("Log_Number2".equals(__fieldName)) {
      this.Log_Number2 = (Integer) __fieldVal;
    }
    else    if ("Log_Number3".equals(__fieldName)) {
      this.Log_Number3 = (Integer) __fieldVal;
    }
    else    if ("Log_Systembit".equals(__fieldName)) {
      this.Log_Systembit = (Integer) __fieldVal;
    }
    else    if ("Log_Number4".equals(__fieldName)) {
      this.Log_Number4 = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
  public boolean setField0(String __fieldName, Object __fieldVal) {
    if ("L_Id".equals(__fieldName)) {
      this.L_Id = (Integer) __fieldVal;
      return true;
    }
    else    if ("Log_Date".equals(__fieldName)) {
      this.Log_Date = (java.sql.Date) __fieldVal;
      return true;
    }
    else    if ("Log_Time".equals(__fieldName)) {
      this.Log_Time = (String) __fieldVal;
      return true;
    }
    else    if ("Log_Path".equals(__fieldName)) {
      this.Log_Path = (String) __fieldVal;
      return true;
    }
    else    if ("Log_Type".equals(__fieldName)) {
      this.Log_Type = (String) __fieldVal;
      return true;
    }
    else    if ("Log_Webfile".equals(__fieldName)) {
      this.Log_Webfile = (String) __fieldVal;
      return true;
    }
    else    if ("Log_Number1".equals(__fieldName)) {
      this.Log_Number1 = (Integer) __fieldVal;
      return true;
    }
    else    if ("Log_IPAddress".equals(__fieldName)) {
      this.Log_IPAddress = (String) __fieldVal;
      return true;
    }
    else    if ("Log_Number2".equals(__fieldName)) {
      this.Log_Number2 = (Integer) __fieldVal;
      return true;
    }
    else    if ("Log_Number3".equals(__fieldName)) {
      this.Log_Number3 = (Integer) __fieldVal;
      return true;
    }
    else    if ("Log_Systembit".equals(__fieldName)) {
      this.Log_Systembit = (Integer) __fieldVal;
      return true;
    }
    else    if ("Log_Number4".equals(__fieldName)) {
      this.Log_Number4 = (Integer) __fieldVal;
      return true;
    }
    else {
      return false;    }
  }
}
