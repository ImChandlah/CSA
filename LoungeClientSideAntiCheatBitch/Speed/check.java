 private Result result;
    private String message;
    private int data;

    public CheckResult(Result result, String message, int data) {
        this(result, message);
        this.data = data;
    }

    public CheckResult(Result result, String message) {
        this(result);
        this.message = message;
    }

    public CheckResult(Result result) {
        this.result = result;
    }

    public boolean failed() {
        return result == Result.FAILED;
    }

    final double val = attr.getValue() / attr.b();
        final AttributeModifier mod = attr.a(AttribUtil.ID_SPRINT_BOOST);
        if (mod == null){
            return val;
        } else {
            return val / AttribUtil.getMultiplier(mod.c(), mod.d());
        }
    }




    public String getMessage(){
        return message;
    }



    public Result getResult() {
        return result;
    }

    public int getData() {
        return data;
    }

