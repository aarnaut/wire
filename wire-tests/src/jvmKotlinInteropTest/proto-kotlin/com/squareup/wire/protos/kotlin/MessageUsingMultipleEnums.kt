// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: same_name_enum.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.hashCode
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * Enum names must be fully qualified in generated Kotlin
 */
class MessageUsingMultipleEnums(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.protos.kotlin.MessageWithStatus${'$'}Status#ADAPTER"
  )
  @JvmField
  val a: MessageWithStatus.Status? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.protos.kotlin.OtherMessageWithStatus${'$'}Status#ADAPTER"
  )
  @JvmField
  val b: OtherMessageWithStatus.Status? = null,
  unknownFields: ByteString = ByteString.EMPTY
) : Message<MessageUsingMultipleEnums, MessageUsingMultipleEnums.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.a = a
    builder.b = b
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is MessageUsingMultipleEnums) return false
    return unknownFields == other.unknownFields
        && a == other.a
        && b == other.b
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + a.hashCode()
      result = result * 37 + b.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (a != null) result += """a=$a"""
    if (b != null) result += """b=$b"""
    return result.joinToString(prefix = "MessageUsingMultipleEnums{", separator = ", ", postfix =
        "}")
  }

  fun copy(
    a: MessageWithStatus.Status? = this.a,
    b: OtherMessageWithStatus.Status? = this.b,
    unknownFields: ByteString = this.unknownFields
  ): MessageUsingMultipleEnums = MessageUsingMultipleEnums(a, b, unknownFields)

  class Builder : Message.Builder<MessageUsingMultipleEnums, Builder>() {
    @JvmField
    var a: MessageWithStatus.Status? = null

    @JvmField
    var b: OtherMessageWithStatus.Status? = null

    fun a(a: MessageWithStatus.Status?): Builder {
      this.a = a
      return this
    }

    fun b(b: OtherMessageWithStatus.Status?): Builder {
      this.b = b
      return this
    }

    override fun build(): MessageUsingMultipleEnums = MessageUsingMultipleEnums(
      a = a,
      b = b,
      unknownFields = buildUnknownFields()
    )
  }

  companion object {
    @JvmField
    val ADAPTER: ProtoAdapter<MessageUsingMultipleEnums> = object :
        ProtoAdapter<MessageUsingMultipleEnums>(
      FieldEncoding.LENGTH_DELIMITED, 
      MessageUsingMultipleEnums::class
    ) {
      override fun encodedSize(value: MessageUsingMultipleEnums): Int = 
        MessageWithStatus.Status.ADAPTER.encodedSizeWithTag(1, value.a) +
        OtherMessageWithStatus.Status.ADAPTER.encodedSizeWithTag(2, value.b) +
        value.unknownFields.size

      override fun encode(writer: ProtoWriter, value: MessageUsingMultipleEnums) {
        MessageWithStatus.Status.ADAPTER.encodeWithTag(writer, 1, value.a)
        OtherMessageWithStatus.Status.ADAPTER.encodeWithTag(writer, 2, value.b)
        writer.writeBytes(value.unknownFields)
      }

      override fun decode(reader: ProtoReader): MessageUsingMultipleEnums {
        var a: MessageWithStatus.Status? = null
        var b: OtherMessageWithStatus.Status? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> a = MessageWithStatus.Status.ADAPTER.decode(reader)
            2 -> b = OtherMessageWithStatus.Status.ADAPTER.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return MessageUsingMultipleEnums(
          a = a,
          b = b,
          unknownFields = unknownFields
        )
      }

      override fun redact(value: MessageUsingMultipleEnums): MessageUsingMultipleEnums = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }
  }
}