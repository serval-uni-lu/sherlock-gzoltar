package com.gzoltar.core.instr;

import javassist.bytecode.AccessFlag;

/**
 * Constants for byte code instrumentation.
 */
public final class InstrumentationConstants {

  public static final String EOL = ";";

  // === System Class' Field ===

  public static final String SYSTEM_CLASS_NAME = "java/lang/UnknownError";

  public static final String SYSTEM_CLASS_NAME_JVM = "java.lang.UnknownError";

  public static final String SYSTEM_CLASS_FIELD_NAME = "$gzoltarAccess";

  public static final String SYSTEM_CLASS_FIELD_DESC = "Object ";

  public static final int SYSTEM_CLASS_FIELD_ACC =
      AccessFlag.PUBLIC | AccessFlag.STATIC /*| AccessFlag.SYNTHETIC*/ | AccessFlag.TRANSIENT;

  // === Data Field ===

  public static final String FIELD_NAME = "$gzoltarData";

  public static final String FIELD_INIT_VALUE = "null";

  public static final String FIELD_DESC_BYTECODE = "[Z";

  public static final String FIELD_DESC_HUMAN = "boolean[] ";

  public static final int FIELD_ACC =
      AccessFlag.PRIVATE | AccessFlag.STATIC /*| AccessFlag.SYNTHETIC*/ | AccessFlag.TRANSIENT;

  public static final int FIELD_INTF_ACC =
      AccessFlag.PUBLIC | AccessFlag.STATIC | AccessFlag.FINAL /*| AccessFlag.SYNTHETIC*/;

  // === Init method ===

  public static final String INIT_METHOD_NAME = "$gzoltarInit";

  public static final String INIT_METHOD_NAME_WITH_ARGS = INIT_METHOD_NAME + "()";

  public static final String INIT_METHOD_DESC_HUMAN = "void ";

  public static final int INIT_METHOD_ACC =
      AccessFlag.PRIVATE | AccessFlag.STATIC /*| AccessFlag.SYNTHETIC*/;

  // TODO we may need extra constants for the init method of Java-8 interfaces

  private InstrumentationConstants() {
    // NO-OP
  }
}