/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package mr.unit.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Temperature extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2130107524177613105L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Temperature\",\"namespace\":\"mr.unit.avro\",\"fields\":[{\"name\":\"date\",\"type\":\"string\"},{\"name\":\"maxTemp\",\"type\":\"float\"},{\"name\":\"minTemp\",\"type\":\"float\"},{\"name\":\"averageTemp\",\"type\":\"float\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Temperature> ENCODER =
      new BinaryMessageEncoder<Temperature>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Temperature> DECODER =
      new BinaryMessageDecoder<Temperature>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Temperature> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Temperature> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Temperature>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Temperature to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Temperature from a ByteBuffer. */
  public static Temperature fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence date;
  @Deprecated public float maxTemp;
  @Deprecated public float minTemp;
  @Deprecated public float averageTemp;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Temperature() {}

  /**
   * All-args constructor.
   * @param date The new value for date
   * @param maxTemp The new value for maxTemp
   * @param minTemp The new value for minTemp
   * @param averageTemp The new value for averageTemp
   */
  public Temperature(java.lang.CharSequence date, java.lang.Float maxTemp, java.lang.Float minTemp, java.lang.Float averageTemp) {
    this.date = date;
    this.maxTemp = maxTemp;
    this.minTemp = minTemp;
    this.averageTemp = averageTemp;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return date;
    case 1: return maxTemp;
    case 2: return minTemp;
    case 3: return averageTemp;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: date = (java.lang.CharSequence)value$; break;
    case 1: maxTemp = (java.lang.Float)value$; break;
    case 2: minTemp = (java.lang.Float)value$; break;
    case 3: averageTemp = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'date' field.
   * @return The value of the 'date' field.
   */
  public java.lang.CharSequence getDate() {
    return date;
  }

  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(java.lang.CharSequence value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'maxTemp' field.
   * @return The value of the 'maxTemp' field.
   */
  public java.lang.Float getMaxTemp() {
    return maxTemp;
  }

  /**
   * Sets the value of the 'maxTemp' field.
   * @param value the value to set.
   */
  public void setMaxTemp(java.lang.Float value) {
    this.maxTemp = value;
  }

  /**
   * Gets the value of the 'minTemp' field.
   * @return The value of the 'minTemp' field.
   */
  public java.lang.Float getMinTemp() {
    return minTemp;
  }

  /**
   * Sets the value of the 'minTemp' field.
   * @param value the value to set.
   */
  public void setMinTemp(java.lang.Float value) {
    this.minTemp = value;
  }

  /**
   * Gets the value of the 'averageTemp' field.
   * @return The value of the 'averageTemp' field.
   */
  public java.lang.Float getAverageTemp() {
    return averageTemp;
  }

  /**
   * Sets the value of the 'averageTemp' field.
   * @param value the value to set.
   */
  public void setAverageTemp(java.lang.Float value) {
    this.averageTemp = value;
  }

  /**
   * Creates a new Temperature RecordBuilder.
   * @return A new Temperature RecordBuilder
   */
  public static mr.unit.avro.Temperature.Builder newBuilder() {
    return new mr.unit.avro.Temperature.Builder();
  }

  /**
   * Creates a new Temperature RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Temperature RecordBuilder
   */
  public static mr.unit.avro.Temperature.Builder newBuilder(mr.unit.avro.Temperature.Builder other) {
    return new mr.unit.avro.Temperature.Builder(other);
  }

  /**
   * Creates a new Temperature RecordBuilder by copying an existing Temperature instance.
   * @param other The existing instance to copy.
   * @return A new Temperature RecordBuilder
   */
  public static mr.unit.avro.Temperature.Builder newBuilder(mr.unit.avro.Temperature other) {
    return new mr.unit.avro.Temperature.Builder(other);
  }

  /**
   * RecordBuilder for Temperature instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Temperature>
    implements org.apache.avro.data.RecordBuilder<Temperature> {

    private java.lang.CharSequence date;
    private float maxTemp;
    private float minTemp;
    private float averageTemp;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(mr.unit.avro.Temperature.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.date)) {
        this.date = data().deepCopy(fields()[0].schema(), other.date);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.maxTemp)) {
        this.maxTemp = data().deepCopy(fields()[1].schema(), other.maxTemp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.minTemp)) {
        this.minTemp = data().deepCopy(fields()[2].schema(), other.minTemp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.averageTemp)) {
        this.averageTemp = data().deepCopy(fields()[3].schema(), other.averageTemp);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Temperature instance
     * @param other The existing instance to copy.
     */
    private Builder(mr.unit.avro.Temperature other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.date)) {
        this.date = data().deepCopy(fields()[0].schema(), other.date);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.maxTemp)) {
        this.maxTemp = data().deepCopy(fields()[1].schema(), other.maxTemp);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.minTemp)) {
        this.minTemp = data().deepCopy(fields()[2].schema(), other.minTemp);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.averageTemp)) {
        this.averageTemp = data().deepCopy(fields()[3].schema(), other.averageTemp);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public java.lang.CharSequence getDate() {
      return date;
    }

    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public mr.unit.avro.Temperature.Builder setDate(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.date = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public mr.unit.avro.Temperature.Builder clearDate() {
      date = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'maxTemp' field.
      * @return The value.
      */
    public java.lang.Float getMaxTemp() {
      return maxTemp;
    }

    /**
      * Sets the value of the 'maxTemp' field.
      * @param value The value of 'maxTemp'.
      * @return This builder.
      */
    public mr.unit.avro.Temperature.Builder setMaxTemp(float value) {
      validate(fields()[1], value);
      this.maxTemp = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'maxTemp' field has been set.
      * @return True if the 'maxTemp' field has been set, false otherwise.
      */
    public boolean hasMaxTemp() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'maxTemp' field.
      * @return This builder.
      */
    public mr.unit.avro.Temperature.Builder clearMaxTemp() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'minTemp' field.
      * @return The value.
      */
    public java.lang.Float getMinTemp() {
      return minTemp;
    }

    /**
      * Sets the value of the 'minTemp' field.
      * @param value The value of 'minTemp'.
      * @return This builder.
      */
    public mr.unit.avro.Temperature.Builder setMinTemp(float value) {
      validate(fields()[2], value);
      this.minTemp = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'minTemp' field has been set.
      * @return True if the 'minTemp' field has been set, false otherwise.
      */
    public boolean hasMinTemp() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'minTemp' field.
      * @return This builder.
      */
    public mr.unit.avro.Temperature.Builder clearMinTemp() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'averageTemp' field.
      * @return The value.
      */
    public java.lang.Float getAverageTemp() {
      return averageTemp;
    }

    /**
      * Sets the value of the 'averageTemp' field.
      * @param value The value of 'averageTemp'.
      * @return This builder.
      */
    public mr.unit.avro.Temperature.Builder setAverageTemp(float value) {
      validate(fields()[3], value);
      this.averageTemp = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'averageTemp' field has been set.
      * @return True if the 'averageTemp' field has been set, false otherwise.
      */
    public boolean hasAverageTemp() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'averageTemp' field.
      * @return This builder.
      */
    public mr.unit.avro.Temperature.Builder clearAverageTemp() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Temperature build() {
      try {
        Temperature record = new Temperature();
        record.date = fieldSetFlags()[0] ? this.date : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.maxTemp = fieldSetFlags()[1] ? this.maxTemp : (java.lang.Float) defaultValue(fields()[1]);
        record.minTemp = fieldSetFlags()[2] ? this.minTemp : (java.lang.Float) defaultValue(fields()[2]);
        record.averageTemp = fieldSetFlags()[3] ? this.averageTemp : (java.lang.Float) defaultValue(fields()[3]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Temperature>
    WRITER$ = (org.apache.avro.io.DatumWriter<Temperature>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Temperature>
    READER$ = (org.apache.avro.io.DatumReader<Temperature>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
