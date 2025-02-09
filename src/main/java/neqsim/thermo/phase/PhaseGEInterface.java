/*
 * PhaseGEInterface.java
 *
 * Created on 12. juli 2000, 00:26
 */

package neqsim.thermo.phase;

/**
 * <p>
 * PhaseGEInterface interface.
 * </p>
 *
 * @author Even Solbraa
 * @version $Id: $Id
 */
public interface PhaseGEInterface {
  /**
   * <p>
   * getExessGibbsEnergy.
   * </p>
   *
   * @param phase a {@link neqsim.thermo.phase.PhaseInterface} object
   * @param numberOfComponents a int
   * @param temperature a double
   * @param pressure a double
   * @param phasetype a int
   * @return a double
   * @deprecated Replaced by {@link getExcessGibbsEnergy}.
   */
  @Deprecated
  public default double getExessGibbsEnergy(PhaseInterface phase, int numberOfComponents,
      double temperature, double pressure, int phasetype) {
    return getExcessGibbsEnergy(phase, numberOfComponents, temperature, pressure, phasetype);
  }

  /**
   * <p>
   * getExcessGibbsEnergy.
   * </p>
   *
   * @param phase a {@link neqsim.thermo.phase.PhaseInterface} object
   * @param numberOfComponents a int
   * @param temperature a double
   * @param pressure a double
   * @param phasetype a int
   * @return a double
   */
  public double getExcessGibbsEnergy(PhaseInterface phase, int numberOfComponents,
      double temperature, double pressure, int phasetype);
}
