package coursier.params

import coursier.core._

final case class ResolutionParams(
  keepOptionalDependencies: Boolean = false,
  maxIterations: Int = 200, // FIXME move elsewhere?
  forceVersion: Map[Module, String] = Map.empty,
  forcedProperties: Map[String, String] = Map.empty,
  profiles: Set[String] = Set.empty,
  scalaVersion: String = ResolutionParams.defaultScalaVersion,
  forceScalaVersion: Boolean = false,
  typelevel: Boolean = false
)

object ResolutionParams extends PlatformResolutionParamsCompanion
