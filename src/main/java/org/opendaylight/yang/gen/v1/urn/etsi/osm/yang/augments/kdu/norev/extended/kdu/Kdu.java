package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.ExtendedKdu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.kdu.KduModel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * List of K8s Deployment Units
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>kdu</b>
 * <pre>
 * list kdu {
 *   key name;
 *   leaf name {
 *     type string;
 *   }
 *   leaf description {
 *     type string;
 *   }
 *   choice kdu-model {
 *     case helm-chart {
 *       leaf helm-chart {
 *         type string;
 *       }
 *       leaf helm-version {
 *         type enumeration {
 *           enum v2;
 *           enum v3;
 *         }
 *         default v3;
 *       }
 *     }
 *     case juju-bundle {
 *       leaf juju-bundle {
 *         type string;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>kdu/extended-kdu/kdu</i>
 * 
 * <p>To create instances of this class use {@link KduBuilder}.
 * @see KduBuilder
 * @see KduKey
 *
 */
public interface Kdu
    extends
    ChildOf<ExtendedKdu>,
    Augmentable<Kdu>,
    Identifiable<KduKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("kdu");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.Kdu> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.Kdu.class;
    }
    
    /**
     * Unique name for the KDU
     *
     *
     *
     * @return <code>java.lang.String</code> <code>name</code>, or <code>null</code> if not present
     */
    @Nullable String getName();
    
    /**
     * Description of the KDU.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>description</code>, or <code>null</code> if not present
     */
    @Nullable String getDescription();
    
    /**
     * Indicates the KDU model, either as a helm-chart or as a juju-bundle.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.kdu.KduModel</code> <code>kduModel</code>, or <code>null</code> if not present
     */
    @Nullable KduModel getKduModel();
    
    @Override
    KduKey key();

}

