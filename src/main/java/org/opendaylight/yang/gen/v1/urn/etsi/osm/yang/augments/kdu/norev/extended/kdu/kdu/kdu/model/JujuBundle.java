package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.kdu.kdu.model;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.kdu.KduModel;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>kdu</b>
 * <pre>
 * case juju-bundle {
 *   leaf juju-bundle {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>kdu/extended-kdu/kdu/kdu-model/juju-bundle</i>
 *
 */
public interface JujuBundle
    extends
    DataObject,
    Augmentable<JujuBundle>,
    KduModel
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("juju-bundle");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.kdu.kdu.model.JujuBundle> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.augments.kdu.norev.extended.kdu.kdu.kdu.model.JujuBundle.class;
    }
    
    /**
     * Juju bundle that models the KDU, in any of the following ways: -
     * &amp;lt;juju-repo&amp;gt;/&amp;lt;juju-bundle&amp;gt; - &amp;lt;juju-bundle
     * folder under k8s_models folder in the package&amp;gt; - &amp;lt;juju-bundle tgz
     * file (w/ or w/o extension) under k8s_models folder in the package&amp;gt; -
     * &amp;lt;URL_where_to_fetch_juju_bundle&amp;gt; 
     *
     *
     *
     * @return <code>java.lang.String</code> <code>jujuBundle</code>, or <code>null</code> if not present
     */
    @Nullable String getJujuBundle();

}

