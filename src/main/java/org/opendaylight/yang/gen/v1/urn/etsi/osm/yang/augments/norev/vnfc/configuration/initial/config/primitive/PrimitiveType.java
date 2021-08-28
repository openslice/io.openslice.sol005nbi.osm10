package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.initial.config.primitive;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.norev.vnfc.configuration.InitialConfigPrimitive;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>common-augments</b>
 * <pre>
 * choice primitive-type {
 *   case primitive-definition {
 *     leaf name {
 *       type string;
 *     }
 *     leaf execution-environment-ref {
 *       type leafref {
 *         path ../../execution-environment-list/id;
 *       }
 *     }
 *     uses primitive-parameter-value;
 *     leaf user-defined-script {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>common-augments/vnfc-configuration/initial-config-primitive/primitive-type</i>
 *
 */
public interface PrimitiveType
    extends
    ChoiceIn<InitialConfigPrimitive>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("primitive-type");


}

