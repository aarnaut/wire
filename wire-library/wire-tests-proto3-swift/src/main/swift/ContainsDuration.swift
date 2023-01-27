// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos3.kotlin.contains_duration.ContainsDuration in contains_duration.proto
import Foundation
import Wire

public struct ContainsDuration {

    public var duration: Duration?
    public var unknownFields: Data = .init()

    public init(duration: Duration? = nil) {
        self.duration = duration
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension ContainsDuration : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension ContainsDuration : Hashable {
}
#endif

#if swift(>=5.5)
extension ContainsDuration : Sendable {
}
#endif

extension ContainsDuration : ProtoMessage {
    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos3.kotlin.contains_duration.ContainsDuration"
    }
}

extension ContainsDuration : Proto3Codable {
    public init(from reader: ProtoReader) throws {
        var duration: Duration? = nil

        let token = try reader.beginMessage()
        while let tag = try reader.nextTag(token: token) {
            switch tag {
            case 1: duration = try reader.decode(Duration.self)
            default: try reader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try reader.endMessage(token: token)

        self.duration = duration
    }

    public func encode(to writer: ProtoWriter) throws {
        try writer.encode(tag: 1, value: self.duration)
        try writer.writeUnknownFields(unknownFields)
    }
}

#if !WIRE_REMOVE_CODABLE
extension ContainsDuration : Codable {
    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        self.duration = try container.decodeIfPresent(Duration.self, forKey: "duration")
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)

        try container.encodeIfPresent(self.duration, forKey: "duration")
    }
}
#endif
