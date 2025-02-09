package neqsim.thermo.component;

import neqsim.thermo.phase.PhaseInterface;

/**
 * <p>
 * ComponentGERG2004 class.
 * </p>
 *
 * @author Even Solbraa
 * @version $Id: $Id
 */
public class ComponentGERG2004 extends ComponentEos {
  private static final long serialVersionUID = 1000;

  /**
   * <p>
   * Constructor for ComponentGERG2004.
   * </p>
   *
   * @param component_name a {@link java.lang.String} object
   * @param moles a double
   * @param molesInPhase a double
   * @param compnumber a int
   */
  public ComponentGERG2004(String component_name, double moles, double molesInPhase,
      int compnumber) {
    super(component_name, moles, molesInPhase, compnumber);
  }

  /**
   * <p>
   * Constructor for ComponentGERG2004.
   * </p>
   *
   * @param number a int
   * @param TC Critical temperature
   * @param PC Critical pressure
   * @param M Molar mass
   * @param a Acentric factor
   * @param moles Number of moles
   */
  public ComponentGERG2004(int number, double TC, double PC, double M, double a, double moles) {
    super(number, TC, PC, M, a, moles);
  }

  /** {@inheritDoc} */
  @Override
  public ComponentGERG2004 clone() {
    ComponentGERG2004 clonedComponent = null;
    try {
      clonedComponent = (ComponentGERG2004) super.clone();
    } catch (Exception ex) {
      logger.error("Cloning failed.", ex);
    }

    return clonedComponent;
  }

  /** {@inheritDoc} */
  @Override
  public double getVolumeCorrection() {
    return 0.0;
  }

  /** {@inheritDoc} */
  @Override
  public double calca() {
    return 0;
  }

  /** {@inheritDoc} */
  @Override
  public double calcb() {
    return 0;
  }

  /** {@inheritDoc} */
  @Override
  public double fugcoef(PhaseInterface phase) {
    return fugacityCoefficient;
  }

  /** {@inheritDoc} */
  @Override
  public double alpha(double temperature) {
    return 1;
  }

  /** {@inheritDoc} */
  @Override
  public double diffaT(double temperature) {
    return 1;
  }

  /** {@inheritDoc} */
  @Override
  public double diffdiffaT(double temperature) {
    return 1;
  }
}
