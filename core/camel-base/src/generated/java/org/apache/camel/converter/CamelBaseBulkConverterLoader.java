/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.converter;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.Ordered;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.TypeConverter;
import org.apache.camel.spi.BulkTypeConverters;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class CamelBaseBulkConverterLoader implements TypeConverterLoader, BulkTypeConverters, CamelContextAware {

    private CamelContext camelContext;

    public CamelBaseBulkConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST;
    }

    @Override
    public int size() {
        return 121;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registry.addBulkTypeConverters(this);
    }

    @Override
    public <T> T convertTo(Class<?> from, Class<T> to, Exchange exchange, Object value) throws TypeConversionException {
        try {
            Object obj = doConvertTo(from, to, exchange, value);
            if (obj == Void.class) {;
                return null;
            } else {
                return (T) obj;
            }
        } catch (TypeConversionException e) {
            throw e;
        } catch (Exception e) {
            throw new TypeConversionException(value, to, e);
        }
    }

    private Object doConvertTo(Class<?> from, Class<?> to, Exchange exchange, Object value) throws Exception {
        if (to == byte[].class) {
            if (value instanceof java.nio.ByteBuffer) {
                return org.apache.camel.converter.NIOConverter.toByteArray((java.nio.ByteBuffer) value);
            }
            if (value instanceof org.apache.camel.spi.Resource) {
                return org.apache.camel.converter.ResourceConverter.toByteArray((org.apache.camel.spi.Resource) value, camelContext);
            }
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.IOConverter.toByteArray((java.io.File) value);
            }
            if (value instanceof java.io.BufferedReader) {
                return org.apache.camel.converter.IOConverter.toByteArray((java.io.BufferedReader) value, exchange);
            }
            if (value instanceof java.io.Reader) {
                return org.apache.camel.converter.IOConverter.toByteArray((java.io.Reader) value, exchange);
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.IOConverter.toByteArray((java.lang.String) value, exchange);
            }
            if (value instanceof java.io.InputStream) {
                return org.apache.camel.converter.IOConverter.toBytes((java.io.InputStream) value);
            }
            if (value instanceof java.io.ByteArrayOutputStream) {
                return org.apache.camel.converter.IOConverter.toByteArray((java.io.ByteArrayOutputStream) value);
            }
        } else if (to == char[].class) {
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toCharArray((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toCharArray((byte[]) value, exchange);
            }
        } else if (to == java.lang.Object[].class) {
            if (value instanceof java.util.Collection) {
                return org.apache.camel.converter.CollectionConverter.toArray((java.util.Collection) value);
            }
        } else if (to == boolean.class) {
            if (value instanceof java.lang.Object) {
                return org.apache.camel.converter.ObjectConverter.toBool(value);
            }
        } else if (to == char.class) {
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toChar((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toChar((byte[]) value);
            }
        } else if (to == java.io.BufferedReader.class) {
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.IOConverter.toReader((java.io.File) value, exchange);
            }
        } else if (to == java.io.BufferedWriter.class) {
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.IOConverter.toWriter((java.io.File) value, exchange);
            }
        } else if (to == java.io.File.class) {
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.IOConverter.toFile((java.lang.String) value);
            }
        } else if (to == java.io.InputStream.class) {
            if (value instanceof java.util.stream.Stream) {
                return org.apache.camel.converter.IOConverter.toInputStream((java.util.stream.Stream) value, exchange);
            }
            if (value instanceof org.apache.camel.spi.Resource) {
                return org.apache.camel.converter.ResourceConverter.toInputStream((org.apache.camel.spi.Resource) value);
            }
            if (value instanceof java.net.URL) {
                return org.apache.camel.converter.IOConverter.toInputStream((java.net.URL) value);
            }
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.IOConverter.toInputStream((java.io.File) value);
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.IOConverter.toInputStream((java.lang.String) value, exchange);
            }
            if (value instanceof java.nio.ByteBuffer) {
                return org.apache.camel.converter.NIOConverter.toInputStream((java.nio.ByteBuffer) value);
            }
            if (value instanceof java.lang.StringBuffer) {
                return org.apache.camel.converter.IOConverter.toInputStream((java.lang.StringBuffer) value, exchange);
            }
            if (value instanceof java.lang.StringBuilder) {
                return org.apache.camel.converter.IOConverter.toInputStream((java.lang.StringBuilder) value, exchange);
            }
            if (value instanceof java.io.BufferedReader) {
                return org.apache.camel.converter.IOConverter.toInputStream((java.io.BufferedReader) value, exchange);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.IOConverter.toInputStream((byte[]) value);
            }
            if (value instanceof java.io.ByteArrayOutputStream) {
                return org.apache.camel.converter.IOConverter.toInputStream((java.io.ByteArrayOutputStream) value);
            }
        } else if (to == java.io.ObjectInput.class) {
            if (value instanceof java.io.InputStream) {
                return org.apache.camel.converter.IOConverter.toObjectInput((java.io.InputStream) value, exchange);
            }
        } else if (to == java.io.ObjectOutput.class) {
            if (value instanceof java.io.OutputStream) {
                return org.apache.camel.converter.IOConverter.toObjectOutput((java.io.OutputStream) value);
            }
        } else if (to == java.io.OutputStream.class) {
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.IOConverter.toOutputStream((java.io.File) value);
            }
        } else if (to == java.io.Reader.class) {
            if (value instanceof org.apache.camel.spi.Resource) {
                return org.apache.camel.converter.ResourceConverter.toReader((org.apache.camel.spi.Resource) value);
            }
            if (value instanceof java.io.InputStream) {
                return org.apache.camel.converter.IOConverter.toReader((java.io.InputStream) value, exchange);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.IOConverter.toReader((byte[]) value, exchange);
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.IOConverter.toReader((java.lang.String) value);
            }
        } else if (to == java.io.Writer.class) {
            if (value instanceof java.io.OutputStream) {
                return org.apache.camel.converter.IOConverter.toWriter((java.io.OutputStream) value, exchange);
            }
        } else if (to == java.lang.Boolean.class || to == boolean.class) {
            if (value instanceof java.lang.Object) {
                return org.apache.camel.converter.ObjectConverter.toBoolean(value);
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toBoolean((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toBoolean((byte[]) value, exchange);
            }
        } else if (to == java.lang.Byte.class) {
            if (value instanceof java.lang.Number) {
                Object obj = org.apache.camel.converter.ObjectConverter.toByte((java.lang.Number) value);
                if (obj == null) {
                    return Void.class;
                } else {
                    return obj;
                }
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toByte((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toByte((byte[]) value, exchange);
            }
        } else if (to == java.lang.Character.class || to == char.class) {
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toCharacter((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toCharacter((byte[]) value);
            }
        } else if (to == java.lang.Class.class) {
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toClass((java.lang.String) value, camelContext);
            }
        } else if (to == java.lang.Double.class || to == double.class) {
            if (value instanceof java.lang.Number) {
                return org.apache.camel.converter.ObjectConverter.toDouble((java.lang.Number) value);
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toDouble((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toDouble((byte[]) value, exchange);
            }
        } else if (to == java.lang.Float.class || to == float.class) {
            if (value instanceof java.lang.Number) {
                return org.apache.camel.converter.ObjectConverter.toFloat((java.lang.Number) value);
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toFloat((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toFloat((byte[]) value, exchange);
            }
        } else if (to == java.lang.Integer.class || to == int.class) {
            if (value instanceof java.lang.Number) {
                Object obj = org.apache.camel.converter.ObjectConverter.toInteger((java.lang.Number) value);
                if (obj == null) {
                    return Void.class;
                } else {
                    return obj;
                }
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toInteger((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toInteger((byte[]) value, exchange);
            }
        } else if (to == java.lang.Iterable.class) {
            if (value instanceof java.lang.Object) {
                return org.apache.camel.converter.ObjectConverter.iterable(value);
            }
        } else if (to == java.lang.Long.class || to == long.class) {
            if (value instanceof java.time.Duration) {
                return org.apache.camel.converter.DurationConverter.toMilliSeconds((java.time.Duration) value);
            }
            if (value instanceof java.sql.Timestamp) {
                return org.apache.camel.converter.SQLConverter.toLong((java.sql.Timestamp) value);
            }
            if (value instanceof java.util.Date) {
                return org.apache.camel.converter.DateTimeConverter.toLong((java.util.Date) value);
            }
            if (value instanceof java.lang.Number) {
                Object obj = org.apache.camel.converter.ObjectConverter.toLong((java.lang.Number) value);
                if (obj == null) {
                    return Void.class;
                } else {
                    return obj;
                }
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toLong((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toLong((byte[]) value, exchange);
            }
        } else if (to == java.lang.Number.class) {
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toNumber((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toNumber((byte[]) value, exchange);
            }
        } else if (to == java.lang.Short.class) {
            if (value instanceof java.lang.Number) {
                Object obj = org.apache.camel.converter.ObjectConverter.toShort((java.lang.Number) value);
                if (obj == null) {
                    return Void.class;
                } else {
                    return obj;
                }
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ObjectConverter.toShort((java.lang.String) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.ObjectConverter.toShort((byte[]) value, exchange);
            }
        } else if (to == java.lang.String.class) {
            if (value instanceof java.net.URI) {
                return org.apache.camel.converter.UriTypeConverter.toString((java.net.URI) value);
            }
            if (value instanceof java.nio.ByteBuffer) {
                return org.apache.camel.converter.NIOConverter.toString((java.nio.ByteBuffer) value, exchange);
            }
            if (value instanceof java.time.Duration) {
                return org.apache.camel.converter.DurationConverter.toString((java.time.Duration) value);
            }
            if (value instanceof org.apache.camel.spi.Resource) {
                return org.apache.camel.converter.ResourceConverter.toString((org.apache.camel.spi.Resource) value, camelContext);
            }
            if (value instanceof char[]) {
                return org.apache.camel.converter.ObjectConverter.fromCharArray((char[]) value);
            }
            if (value instanceof byte[]) {
                return org.apache.camel.converter.IOConverter.toString((byte[]) value, exchange);
            }
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.IOConverter.toString((java.io.File) value, exchange);
            }
            if (value instanceof java.net.URL) {
                return org.apache.camel.converter.IOConverter.toString((java.net.URL) value, exchange);
            }
            if (value instanceof java.io.BufferedReader) {
                return org.apache.camel.converter.IOConverter.toString((java.io.BufferedReader) value);
            }
            if (value instanceof java.io.Reader) {
                return org.apache.camel.converter.IOConverter.toString((java.io.Reader) value);
            }
            if (value instanceof java.io.InputStream) {
                return org.apache.camel.converter.IOConverter.toString((java.io.InputStream) value, exchange);
            }
            if (value instanceof java.io.ByteArrayOutputStream) {
                return org.apache.camel.converter.IOConverter.toString((java.io.ByteArrayOutputStream) value, exchange);
            }
            if (value instanceof java.lang.Integer) {
                return org.apache.camel.converter.ObjectConverter.toString((java.lang.Integer) value);
            }
            if (value instanceof java.lang.Long) {
                return org.apache.camel.converter.ObjectConverter.toString((java.lang.Long) value);
            }
            if (value instanceof java.lang.Boolean) {
                return org.apache.camel.converter.ObjectConverter.toString((java.lang.Boolean) value);
            }
            if (value instanceof java.lang.StringBuffer) {
                return org.apache.camel.converter.ObjectConverter.toString((java.lang.StringBuffer) value);
            }
            if (value instanceof java.lang.StringBuilder) {
                return org.apache.camel.converter.ObjectConverter.toString((java.lang.StringBuilder) value);
            }
        } else if (to == java.math.BigInteger.class) {
            if (value instanceof java.lang.Object) {
                Object obj = org.apache.camel.converter.ObjectConverter.toBigInteger(value);
                if (obj == null) {
                    return Void.class;
                } else {
                    return obj;
                }
            }
        } else if (to == java.net.URI.class) {
            if (value instanceof java.lang.CharSequence) {
                return org.apache.camel.converter.UriTypeConverter.toUri((java.lang.CharSequence) value);
            }
        } else if (to == java.nio.ByteBuffer.class) {
            if (value instanceof byte[]) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((byte[]) value);
            }
            if (value instanceof java.io.ByteArrayOutputStream) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((java.io.ByteArrayOutputStream) value);
            }
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((java.io.File) value);
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((java.lang.String) value, exchange);
            }
            if (value instanceof java.lang.Short) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((java.lang.Short) value);
            }
            if (value instanceof java.lang.Integer) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((java.lang.Integer) value);
            }
            if (value instanceof java.lang.Long) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((java.lang.Long) value);
            }
            if (value instanceof java.lang.Float) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((java.lang.Float) value);
            }
            if (value instanceof java.lang.Double) {
                return org.apache.camel.converter.NIOConverter.toByteBuffer((java.lang.Double) value);
            }
            if (value instanceof java.io.InputStream) {
                return org.apache.camel.converter.IOConverter.covertToByteBuffer((java.io.InputStream) value);
            }
        } else if (to == java.nio.file.Path.class) {
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.IOConverter.toPath((java.io.File) value);
            }
        } else if (to == java.sql.Timestamp.class) {
            if (value instanceof java.lang.Long) {
                return org.apache.camel.converter.SQLConverter.toTimestamp((java.lang.Long) value);
            }
        } else if (to == java.time.Duration.class) {
            if (value instanceof java.lang.Long) {
                return org.apache.camel.converter.DurationConverter.toDuration((java.lang.Long) value);
            }
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.DurationConverter.toDuration((java.lang.String) value);
            }
        } else if (to == java.util.ArrayList.class) {
            if (value instanceof java.util.Iterator) {
                return org.apache.camel.converter.CollectionConverter.toArrayList((java.util.Iterator) value);
            }
            if (value instanceof java.lang.Iterable) {
                return org.apache.camel.converter.CollectionConverter.toArrayList((java.lang.Iterable) value);
            }
        } else if (to == java.util.Collection.class) {
            if (value instanceof java.util.Map) {
                return org.apache.camel.converter.CollectionConverter.toCollection((java.util.Map) value);
            }
        } else if (to == java.util.Date.class) {
            if (value instanceof java.lang.Long) {
                return org.apache.camel.converter.DateTimeConverter.toDate((java.lang.Long) value);
            }
        } else if (to == java.util.HashMap.class) {
            if (value instanceof java.util.Map) {
                return org.apache.camel.converter.CollectionConverter.toHashMap((java.util.Map) value);
            }
        } else if (to == java.util.Hashtable.class) {
            if (value instanceof java.util.Map) {
                return org.apache.camel.converter.CollectionConverter.toHashtable((java.util.Map) value);
            }
        } else if (to == java.util.Iterator.class) {
            if (value instanceof java.lang.Object) {
                return org.apache.camel.converter.ObjectConverter.iterator(value);
            }
        } else if (to == java.util.List.class) {
            if (value instanceof java.lang.Object[]) {
                return org.apache.camel.converter.CollectionConverter.toList((java.lang.Object[]) value);
            }
            if (value instanceof java.util.Collection) {
                return org.apache.camel.converter.CollectionConverter.toList((java.util.Collection) value);
            }
            if (value instanceof java.lang.Iterable) {
                return org.apache.camel.converter.CollectionConverter.toList((java.lang.Iterable) value);
            }
            if (value instanceof java.util.Iterator) {
                return org.apache.camel.converter.CollectionConverter.toList((java.util.Iterator) value);
            }
        } else if (to == java.util.Properties.class) {
            if (value instanceof java.util.Map) {
                return org.apache.camel.converter.CollectionConverter.toProperties((java.util.Map) value);
            }
            if (value instanceof java.io.File) {
                return org.apache.camel.converter.IOConverter.toProperties((java.io.File) value);
            }
            if (value instanceof java.io.InputStream) {
                return org.apache.camel.converter.IOConverter.toProperties((java.io.InputStream) value);
            }
            if (value instanceof java.io.Reader) {
                return org.apache.camel.converter.IOConverter.toProperties((java.io.Reader) value);
            }
        } else if (to == java.util.Set.class) {
            if (value instanceof java.lang.Object[]) {
                return org.apache.camel.converter.CollectionConverter.toSet((java.lang.Object[]) value);
            }
            if (value instanceof java.util.Collection) {
                return org.apache.camel.converter.CollectionConverter.toSet((java.util.Collection) value);
            }
            if (value instanceof java.util.Map) {
                return org.apache.camel.converter.CollectionConverter.toSet((java.util.Map) value);
            }
        } else if (to == java.util.TimeZone.class) {
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.DateTimeConverter.toTimeZone((java.lang.String) value);
            }
        } else if (to == org.apache.camel.Processor.class) {
            if (value instanceof org.apache.camel.Expression) {
                return org.apache.camel.converter.CamelConverter.toProcessor((org.apache.camel.Expression) value);
            }
            if (value instanceof org.apache.camel.Predicate) {
                return org.apache.camel.converter.CamelConverter.toProcessor((org.apache.camel.Predicate) value);
            }
        } else if (to == org.apache.camel.spi.Resource.class) {
            if (value instanceof java.lang.String) {
                return org.apache.camel.converter.ResourceConverter.toResource((java.lang.String) value, camelContext);
            }
        }
        return null;
    }

    public TypeConverter lookup(Class<?> to, Class<?> from) {
        if (to == byte[].class) {
            if (from == java.nio.ByteBuffer.class) {
                return this;
            }
            if (from == org.apache.camel.spi.Resource.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == java.io.BufferedReader.class) {
                return this;
            }
            if (from == java.io.Reader.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.ByteArrayOutputStream.class) {
                return this;
            }
        } else if (to == char[].class) {
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Object[].class) {
            if (from == java.util.Collection.class) {
                return this;
            }
        } else if (to == boolean.class) {
            if (from == java.lang.Object.class) {
                return this;
            }
        } else if (to == char.class) {
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.io.BufferedReader.class) {
            if (from == java.io.File.class) {
                return this;
            }
        } else if (to == java.io.BufferedWriter.class) {
            if (from == java.io.File.class) {
                return this;
            }
        } else if (to == java.io.File.class) {
            if (from == java.lang.String.class) {
                return this;
            }
        } else if (to == java.io.InputStream.class) {
            if (from == java.util.stream.Stream.class) {
                return this;
            }
            if (from == org.apache.camel.spi.Resource.class) {
                return this;
            }
            if (from == java.net.URL.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == java.nio.ByteBuffer.class) {
                return this;
            }
            if (from == java.lang.StringBuffer.class) {
                return this;
            }
            if (from == java.lang.StringBuilder.class) {
                return this;
            }
            if (from == java.io.BufferedReader.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == java.io.ByteArrayOutputStream.class) {
                return this;
            }
        } else if (to == java.io.ObjectInput.class) {
            if (from == java.io.InputStream.class) {
                return this;
            }
        } else if (to == java.io.ObjectOutput.class) {
            if (from == java.io.OutputStream.class) {
                return this;
            }
        } else if (to == java.io.OutputStream.class) {
            if (from == java.io.File.class) {
                return this;
            }
        } else if (to == java.io.Reader.class) {
            if (from == org.apache.camel.spi.Resource.class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
        } else if (to == java.io.Writer.class) {
            if (from == java.io.OutputStream.class) {
                return this;
            }
        } else if (to == java.lang.Boolean.class || to == boolean.class) {
            if (from == java.lang.Object.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Byte.class) {
            if (from == java.lang.Number.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Character.class || to == char.class) {
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Class.class) {
            if (from == java.lang.String.class) {
                return this;
            }
        } else if (to == java.lang.Double.class || to == double.class) {
            if (from == java.lang.Number.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Float.class || to == float.class) {
            if (from == java.lang.Number.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Integer.class || to == int.class) {
            if (from == java.lang.Number.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Iterable.class) {
            if (from == java.lang.Object.class) {
                return this;
            }
        } else if (to == java.lang.Long.class || to == long.class) {
            if (from == java.time.Duration.class) {
                return this;
            }
            if (from == java.sql.Timestamp.class) {
                return this;
            }
            if (from == java.util.Date.class) {
                return this;
            }
            if (from == java.lang.Number.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Number.class) {
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.Short.class) {
            if (from == java.lang.Number.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
        } else if (to == java.lang.String.class) {
            if (from == java.net.URI.class) {
                return this;
            }
            if (from == java.nio.ByteBuffer.class) {
                return this;
            }
            if (from == java.time.Duration.class) {
                return this;
            }
            if (from == org.apache.camel.spi.Resource.class) {
                return this;
            }
            if (from == char[].class) {
                return this;
            }
            if (from == byte[].class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == java.net.URL.class) {
                return this;
            }
            if (from == java.io.BufferedReader.class) {
                return this;
            }
            if (from == java.io.Reader.class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.ByteArrayOutputStream.class) {
                return this;
            }
            if (from == java.lang.Integer.class) {
                return this;
            }
            if (from == java.lang.Long.class) {
                return this;
            }
            if (from == java.lang.Boolean.class) {
                return this;
            }
            if (from == java.lang.StringBuffer.class) {
                return this;
            }
            if (from == java.lang.StringBuilder.class) {
                return this;
            }
        } else if (to == java.math.BigInteger.class) {
            if (from == java.lang.Object.class) {
                return this;
            }
        } else if (to == java.net.URI.class) {
            if (from == java.lang.CharSequence.class) {
                return this;
            }
        } else if (to == java.nio.ByteBuffer.class) {
            if (from == byte[].class) {
                return this;
            }
            if (from == java.io.ByteArrayOutputStream.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
            if (from == java.lang.Short.class) {
                return this;
            }
            if (from == java.lang.Integer.class) {
                return this;
            }
            if (from == java.lang.Long.class) {
                return this;
            }
            if (from == java.lang.Float.class) {
                return this;
            }
            if (from == java.lang.Double.class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
        } else if (to == java.nio.file.Path.class) {
            if (from == java.io.File.class) {
                return this;
            }
        } else if (to == java.sql.Timestamp.class) {
            if (from == java.lang.Long.class) {
                return this;
            }
        } else if (to == java.time.Duration.class) {
            if (from == java.lang.Long.class) {
                return this;
            }
            if (from == java.lang.String.class) {
                return this;
            }
        } else if (to == java.util.ArrayList.class) {
            if (from == java.util.Iterator.class) {
                return this;
            }
            if (from == java.lang.Iterable.class) {
                return this;
            }
        } else if (to == java.util.Collection.class) {
            if (from == java.util.Map.class) {
                return this;
            }
        } else if (to == java.util.Date.class) {
            if (from == java.lang.Long.class) {
                return this;
            }
        } else if (to == java.util.HashMap.class) {
            if (from == java.util.Map.class) {
                return this;
            }
        } else if (to == java.util.Hashtable.class) {
            if (from == java.util.Map.class) {
                return this;
            }
        } else if (to == java.util.Iterator.class) {
            if (from == java.lang.Object.class) {
                return this;
            }
        } else if (to == java.util.List.class) {
            if (from == java.lang.Object[].class) {
                return this;
            }
            if (from == java.util.Collection.class) {
                return this;
            }
            if (from == java.lang.Iterable.class) {
                return this;
            }
            if (from == java.util.Iterator.class) {
                return this;
            }
        } else if (to == java.util.Properties.class) {
            if (from == java.util.Map.class) {
                return this;
            }
            if (from == java.io.File.class) {
                return this;
            }
            if (from == java.io.InputStream.class) {
                return this;
            }
            if (from == java.io.Reader.class) {
                return this;
            }
        } else if (to == java.util.Set.class) {
            if (from == java.lang.Object[].class) {
                return this;
            }
            if (from == java.util.Collection.class) {
                return this;
            }
            if (from == java.util.Map.class) {
                return this;
            }
        } else if (to == java.util.TimeZone.class) {
            if (from == java.lang.String.class) {
                return this;
            }
        } else if (to == org.apache.camel.Processor.class) {
            if (from == org.apache.camel.Expression.class) {
                return this;
            }
            if (from == org.apache.camel.Predicate.class) {
                return this;
            }
        } else if (to == org.apache.camel.spi.Resource.class) {
            if (from == java.lang.String.class) {
                return this;
            }
        }
        return null;
    }

}
