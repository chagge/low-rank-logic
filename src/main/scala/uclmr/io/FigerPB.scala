package uclmr.io

import com.google.protobuf.CodedOutputStream._
import com.google.protobuf.ExtensionRegistryLite._

/**
 * Created by sameer on 11/16/14.
 */
object FigerPB {
  // Generated by ScalaBuff, the Scala Protocol Buffers compiler. DO NOT EDIT!
  // source: entity.proto

  final case class Mention (
                           `start`: Option[Int] = None,
                           `end`: Option[Int] = None,
                           `tokens`: collection.immutable.Seq[String] = Vector.empty[String],
                           `posTags`: collection.immutable.Seq[String] = Vector.empty[String],
                           `deps`: collection.immutable.Seq[Mention.Dependency] = Vector.empty[Mention.Dependency],
                           `entityName`: Option[String] = None,
                           `features`: collection.immutable.Seq[String] = Vector.empty[String],
                           `labels`: collection.immutable.Seq[String] = Vector.empty[String],
                           `sentid`: Option[Int] = None,
                           `fileid`: Option[String] = None
                           ) extends com.google.protobuf.GeneratedMessageLite
                                     with com.google.protobuf.MessageLite.Builder
                                     with net.sandrogrzicic.scalabuff.Message[Mention]
                                     with net.sandrogrzicic.scalabuff.Parser[Mention] {

    def setStart(_f: Int) = copy(`start` = Some(_f))
    def setEnd(_f: Int) = copy(`end` = Some(_f))
    def setTokens(_i: Int, _v: String) = copy(`tokens` = `tokens`.updated(_i, _v))
    def addTokens(_f: String) = copy(`tokens` = `tokens` :+ _f)
    def addAllTokens(_f: String*) = copy(`tokens` = `tokens` ++ _f)
    def addAllTokens(_f: TraversableOnce[String]) = copy(`tokens` = `tokens` ++ _f)
    def setPosTags(_i: Int, _v: String) = copy(`posTags` = `posTags`.updated(_i, _v))
    def addPosTags(_f: String) = copy(`posTags` = `posTags` :+ _f)
    def addAllPosTags(_f: String*) = copy(`posTags` = `posTags` ++ _f)
    def addAllPosTags(_f: TraversableOnce[String]) = copy(`posTags` = `posTags` ++ _f)
    def setDeps(_i: Int, _v: Mention.Dependency) = copy(`deps` = `deps`.updated(_i, _v))
    def addDeps(_f: Mention.Dependency) = copy(`deps` = `deps` :+ _f)
    def addAllDeps(_f: Mention.Dependency*) = copy(`deps` = `deps` ++ _f)
    def addAllDeps(_f: TraversableOnce[Mention.Dependency]) = copy(`deps` = `deps` ++ _f)
    def setEntityName(_f: String) = copy(`entityName` = Some(_f))
    def setFeatures(_i: Int, _v: String) = copy(`features` = `features`.updated(_i, _v))
    def addFeatures(_f: String) = copy(`features` = `features` :+ _f)
    def addAllFeatures(_f: String*) = copy(`features` = `features` ++ _f)
    def addAllFeatures(_f: TraversableOnce[String]) = copy(`features` = `features` ++ _f)
    def setLabels(_i: Int, _v: String) = copy(`labels` = `labels`.updated(_i, _v))
    def addLabels(_f: String) = copy(`labels` = `labels` :+ _f)
    def addAllLabels(_f: String*) = copy(`labels` = `labels` ++ _f)
    def addAllLabels(_f: TraversableOnce[String]) = copy(`labels` = `labels` ++ _f)
    def setSentid(_f: Int) = copy(`sentid` = Some(_f))
    def setFileid(_f: String) = copy(`fileid` = Some(_f))

    def clearStart = copy(`start` = None)
    def clearEnd = copy(`end` = None)
    def clearTokens = copy(`tokens` = Vector.empty[String])
    def clearPosTags = copy(`posTags` = Vector.empty[String])
    def clearDeps = copy(`deps` = Vector.empty[Mention.Dependency])
    def clearEntityName = copy(`entityName` = None)
    def clearFeatures = copy(`features` = Vector.empty[String])
    def clearLabels = copy(`labels` = Vector.empty[String])
    def clearSentid = copy(`sentid` = None)
    def clearFileid = copy(`fileid` = None)

    def writeTo(output: com.google.protobuf.CodedOutputStream) {
      if (`start`.isDefined) output.writeInt32(1, `start`.get)
      if (`end`.isDefined) output.writeInt32(2, `end`.get)
      for (_v <- `tokens`) output.writeString(3, _v)
      for (_v <- `posTags`) output.writeString(4, _v)
      for (_v <- `deps`) output.writeMessage(5, _v)
      if (`entityName`.isDefined) output.writeString(6, `entityName`.get)
      for (_v <- `features`) output.writeString(7, _v)
      for (_v <- `labels`) output.writeString(8, _v)
      if (`sentid`.isDefined) output.writeInt32(9, `sentid`.get)
      if (`fileid`.isDefined) output.writeString(10, `fileid`.get)
    }

    lazy val getSerializedSize = {
      import com.google.protobuf.CodedOutputStream._
      var __size = 0
      if (`start`.isDefined) __size += computeInt32Size(1, `start`.get)
      if (`end`.isDefined) __size += computeInt32Size(2, `end`.get)
      for (_v <- `tokens`) __size += computeStringSize(3, _v)
      for (_v <- `posTags`) __size += computeStringSize(4, _v)
      for (_v <- `deps`) __size += computeMessageSize(5, _v)
      if (`entityName`.isDefined) __size += computeStringSize(6, `entityName`.get)
      for (_v <- `features`) __size += computeStringSize(7, _v)
      for (_v <- `labels`) __size += computeStringSize(8, _v)
      if (`sentid`.isDefined) __size += computeInt32Size(9, `sentid`.get)
      if (`fileid`.isDefined) __size += computeStringSize(10, `fileid`.get)

      __size
    }

    def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Mention = {
      import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
      var __start: Option[Int] = `start`
      var __end: Option[Int] = `end`
      val __tokens: collection.mutable.Buffer[String] = `tokens`.toBuffer
      val __posTags: collection.mutable.Buffer[String] = `posTags`.toBuffer
      val __deps: collection.mutable.Buffer[Mention.Dependency] = `deps`.toBuffer
      var __entityName: Option[String] = `entityName`
      val __features: collection.mutable.Buffer[String] = `features`.toBuffer
      val __labels: collection.mutable.Buffer[String] = `labels`.toBuffer
      var __sentid: Option[Int] = `sentid`
      var __fileid: Option[String] = `fileid`

      def __newMerged = Mention(
        __start,
        __end,
        Vector(__tokens: _*),
        Vector(__posTags: _*),
        Vector(__deps: _*),
        __entityName,
        Vector(__features: _*),
        Vector(__labels: _*),
        __sentid,
        __fileid
      )
      while (true) in.readTag match {
        case 0 => return __newMerged
        case 8 => __start = Some(in.readInt32())
        case 16 => __end = Some(in.readInt32())
        case 26 => __tokens += in.readString()
        case 34 => __posTags += in.readString()
        case 42 => __deps += readMessage[Mention.Dependency](in, Mention.Dependency.defaultInstance, _emptyRegistry)
        case 50 => __entityName = Some(in.readString())
        case 58 => __features += in.readString()
        case 66 => __labels += in.readString()
        case 72 => __sentid = Some(in.readInt32())
        case 82 => __fileid = Some(in.readString())
        case default => if (!in.skipField(default)) return __newMerged
      }
      null
    }

    def mergeFrom(m: Mention) = {
      Mention(
        m.`start`.orElse(`start`),
        m.`end`.orElse(`end`),
        `tokens` ++ m.`tokens`,
        `posTags` ++ m.`posTags`,
        `deps` ++ m.`deps`,
        m.`entityName`.orElse(`entityName`),
        `features` ++ m.`features`,
        `labels` ++ m.`labels`,
        m.`sentid`.orElse(`sentid`),
        m.`fileid`.orElse(`fileid`)
      )
    }

    def getDefaultInstanceForType = Mention.defaultInstance
    def clear = getDefaultInstanceForType
    def isInitialized = true
    def build = this
    def buildPartial = this
    def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
    override def getParserForType = this
    def newBuilderForType = getDefaultInstanceForType
    def toBuilder = this
    def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
  }

  object Mention {
    @reflect.BeanProperty val defaultInstance = new Mention()

    def parseFrom(data: Array[Byte]): Mention = defaultInstance.mergeFrom(data)
    def parseFrom(data: Array[Byte], offset: Int, length: Int): Mention = defaultInstance.mergeFrom(data, offset, length)
    def parseFrom(byteString: com.google.protobuf.ByteString): Mention = defaultInstance.mergeFrom(byteString)
    def parseFrom(stream: java.io.InputStream): Mention = defaultInstance.mergeFrom(stream)
    def parseDelimitedFrom(stream: java.io.InputStream): Option[Mention] = defaultInstance.mergeDelimitedFromStream(stream)

    val START_FIELD_NUMBER = 1
    val END_FIELD_NUMBER = 2
    val TOKENS_FIELD_NUMBER = 3
    val POS_TAGS_FIELD_NUMBER = 4
    val DEPS_FIELD_NUMBER = 5
    val ENTITY_NAME_FIELD_NUMBER = 6
    val FEATURES_FIELD_NUMBER = 7
    val LABELS_FIELD_NUMBER = 8
    val SENTID_FIELD_NUMBER = 9
    val FILEID_FIELD_NUMBER = 10

    def newBuilder = defaultInstance.newBuilderForType
    def newBuilder(prototype: Mention) = defaultInstance.mergeFrom(prototype)

    final case class Dependency (
                                `type`: Option[String] = None,
                                `gov`: Option[Int] = None,
                                `dep`: Option[Int] = None
                                ) extends com.google.protobuf.GeneratedMessageLite
                                          with com.google.protobuf.MessageLite.Builder
                                          with net.sandrogrzicic.scalabuff.Message[Dependency]
                                          with net.sandrogrzicic.scalabuff.Parser[Dependency] {

      def setType(_f: String) = copy(`type` = Some(_f))
      def setGov(_f: Int) = copy(`gov` = Some(_f))
      def setDep(_f: Int) = copy(`dep` = Some(_f))

      def clearType = copy(`type` = None)
      def clearGov = copy(`gov` = None)
      def clearDep = copy(`dep` = None)

      def writeTo(output: com.google.protobuf.CodedOutputStream) {
        if (`type`.isDefined) output.writeString(1, `type`.get)
        if (`gov`.isDefined) output.writeInt32(2, `gov`.get)
        if (`dep`.isDefined) output.writeInt32(3, `dep`.get)
      }

      lazy val getSerializedSize = {
        import com.google.protobuf.CodedOutputStream._
        var __size = 0
        if (`type`.isDefined) __size += computeStringSize(1, `type`.get)
        if (`gov`.isDefined) __size += computeInt32Size(2, `gov`.get)
        if (`dep`.isDefined) __size += computeInt32Size(3, `dep`.get)

        __size
      }

      def mergeFrom(in: com.google.protobuf.CodedInputStream, extensionRegistry: com.google.protobuf.ExtensionRegistryLite): Dependency = {
        import com.google.protobuf.ExtensionRegistryLite.{getEmptyRegistry => _emptyRegistry}
        var __type: Option[String] = `type`
        var __gov: Option[Int] = `gov`
        var __dep: Option[Int] = `dep`

        def __newMerged = Dependency(
          __type,
          __gov,
          __dep
        )
        while (true) in.readTag match {
          case 0 => return __newMerged
          case 10 => __type = Some(in.readString())
          case 16 => __gov = Some(in.readInt32())
          case 24 => __dep = Some(in.readInt32())
          case default => if (!in.skipField(default)) return __newMerged
        }
        null
      }

      def mergeFrom(m: Dependency) = {
        Dependency(
          m.`type`.orElse(`type`),
          m.`gov`.orElse(`gov`),
          m.`dep`.orElse(`dep`)
        )
      }

      def getDefaultInstanceForType = Dependency.defaultInstance
      def clear = getDefaultInstanceForType
      def isInitialized = true
      def build = this
      def buildPartial = this
      def parsePartialFrom(cis: com.google.protobuf.CodedInputStream, er: com.google.protobuf.ExtensionRegistryLite) = mergeFrom(cis, er)
      override def getParserForType = this
      def newBuilderForType = getDefaultInstanceForType
      def toBuilder = this
      def toJson(indent: Int = 0): String = "ScalaBuff JSON generation not enabled. Use --generate_json_method to enable."
    }

    object Dependency {
      @reflect.BeanProperty val defaultInstance = new Dependency()

      def parseFrom(data: Array[Byte]): Dependency = defaultInstance.mergeFrom(data)
      def parseFrom(data: Array[Byte], offset: Int, length: Int): Dependency = defaultInstance.mergeFrom(data, offset, length)
      def parseFrom(byteString: com.google.protobuf.ByteString): Dependency = defaultInstance.mergeFrom(byteString)
      def parseFrom(stream: java.io.InputStream): Dependency = defaultInstance.mergeFrom(stream)
      def parseDelimitedFrom(stream: java.io.InputStream): Option[Dependency] = defaultInstance.mergeDelimitedFromStream(stream)

      val TYPE_FIELD_NUMBER = 1
      val GOV_FIELD_NUMBER = 2
      val DEP_FIELD_NUMBER = 3

      def newBuilder = defaultInstance.newBuilderForType
      def newBuilder(prototype: Dependency) = defaultInstance.mergeFrom(prototype)

    }
  }

  object EntityProtos {
    def registerAllExtensions(registry: com.google.protobuf.ExtensionRegistryLite) {
    }

  }

}
