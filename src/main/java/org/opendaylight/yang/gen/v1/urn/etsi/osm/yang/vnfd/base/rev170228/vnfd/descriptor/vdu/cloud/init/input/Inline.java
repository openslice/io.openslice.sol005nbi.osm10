package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.CloudInitInput;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * case inline {
 *   leaf cloud-init {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/cloud-init-input/inline</i>
 *
 */
public interface Inline
    extends
    DataObject,
    Augmentable<Inline>,
    CloudInitInput
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("inline");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.vdu.cloud.init.input.Inline.class;
    }
    
    /**
     * Contents of cloud-init script, provided inline, in cloud-config format
     *
     *
     *
     * @return <code>java.lang.String</code> <code>cloudInit</code>, or <code>null</code> if not present
     */
    @Nullable String getCloudInit();

}

